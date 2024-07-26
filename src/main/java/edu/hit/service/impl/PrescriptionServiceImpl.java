package edu.hit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.hit.mapper.PrescriptionMapper;
import edu.hit.pojo.Prescription;
import edu.hit.service.PrescriptionService;
import org.springframework.stereotype.Service;

@Service
public class PrescriptionServiceImpl extends ServiceImpl<PrescriptionMapper, Prescription> implements PrescriptionService {
}
