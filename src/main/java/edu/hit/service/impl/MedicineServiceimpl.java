package edu.hit.service.impl;

import edu.hit.mapper.MedicineMapper;
import edu.hit.pojo.PageBean;
import edu.hit.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import edu.hit.pojo.Medicine;

import java.time.LocalDate;
import java.util.List;

@Service
public class MedicineServiceimpl implements MedicineService {

    @Autowired
    private MedicineMapper medicineMapper;
    @Override
    public PageBean page(Integer page, Integer pageSize, String name, LocalDate begin, LocalDate end) {
        //1. 设置分页pagehelper参数
        PageHelper.startPage(page, pageSize);
        //2. 执行查询
        List<Medicine> medicinesList = medicineMapper.list(name,begin,end);
        Page<Medicine> c = (Page<Medicine>) medicinesList;
        //3. 封装PageBean对象,并返回
        return new PageBean(c.getTotal(), c.getResult());
    }

    @Override
    public void delete(Integer id) {
        medicineMapper.delete(id);
    }

    @Override
    public void add(Medicine medicine) {

        medicineMapper.add(medicine);
    }

    @Override
    public void update(Medicine medicine) {
        medicineMapper.update(medicine);
    }
}
