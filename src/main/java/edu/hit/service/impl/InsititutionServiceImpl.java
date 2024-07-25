package edu.hit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.hit.mapper.InsititutionMapper;
import edu.hit.pojo.Insititution;
import edu.hit.service.InsititutionService;
import org.springframework.stereotype.Service;

@Service
public class InsititutionServiceImpl extends ServiceImpl<InsititutionMapper, Insititution> implements InsititutionService {
}
