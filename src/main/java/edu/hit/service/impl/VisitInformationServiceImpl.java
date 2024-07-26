package edu.hit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.hit.mapper.VisitInformationMapper;
import edu.hit.pojo.VisitInformation;
import edu.hit.service.VisitInformationService;
import org.springframework.stereotype.Service;

@Service
public class VisitInformationServiceImpl extends ServiceImpl<VisitInformationMapper, VisitInformation> implements VisitInformationService {
}
