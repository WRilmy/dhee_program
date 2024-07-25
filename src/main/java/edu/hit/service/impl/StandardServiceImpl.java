package edu.hit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.hit.mapper.StandardMapper;
import edu.hit.pojo.Standard;
import edu.hit.service.StandardService;
import org.springframework.stereotype.Service;

@Service
public class StandardServiceImpl extends ServiceImpl<StandardMapper, Standard> implements StandardService {
}
