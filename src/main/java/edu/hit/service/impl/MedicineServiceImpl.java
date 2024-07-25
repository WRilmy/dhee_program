package edu.hit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.hit.mapper.MedicineMapper;
import edu.hit.pojo.Medicine;
import edu.hit.service.MedicineService;
import org.springframework.stereotype.Service;

@Service
public class MedicineServiceImpl extends ServiceImpl<MedicineMapper, Medicine> implements MedicineService {
}
