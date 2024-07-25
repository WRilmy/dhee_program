package edu.hit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.hit.mapper.RatioMapper;
import edu.hit.pojo.Ratio;
import edu.hit.service.RatioService;
import org.springframework.stereotype.Service;

@Service
public class RatioServiceImpl extends ServiceImpl<RatioMapper, Ratio> implements RatioService {
}
