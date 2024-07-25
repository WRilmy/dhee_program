package edu.hit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.hit.mapper.CappingMapper;
import edu.hit.pojo.Capping;
import edu.hit.service.CappingService;
import org.springframework.stereotype.Service;

@Service
public class CappingServiceImpl extends ServiceImpl<CappingMapper, Capping> implements CappingService {
}
