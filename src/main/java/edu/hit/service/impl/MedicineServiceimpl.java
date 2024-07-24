package edu.hit.service.impl;

import edu.hit.pojo.PageBean;
import edu.hit.service.MedicineService;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import java.time.LocalDate;
import java.util.List;

@Service
public class MedicineServiceimpl implements MedicineService {

    @Override
    public PageBean page(Integer page, Integer pageSize, String name, Object o, Object o1) {
        //1. 设置分页pagehelper参数
        PageHelper.startPage(page, pageSize);
        //2. 执行查询
        List<Medicine> classesList = classesMapper.list(name,begin,end);
        Page<Classes> c = (Page<Classes>) classesList;
        //3. 封装PageBean对象,并返回
        return new PageBean(c.getTotal(), c.getResult());
    }
}
