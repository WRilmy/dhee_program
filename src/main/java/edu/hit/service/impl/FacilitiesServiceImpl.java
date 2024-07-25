package edu.hit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.hit.mapper.FacilitiesMapper;
import edu.hit.pojo.Facilities;
import edu.hit.service.FacilitiesService;
import org.springframework.stereotype.Service;

@Service
public class FacilitiesServiceImpl extends ServiceImpl<FacilitiesMapper, Facilities> implements FacilitiesService {

}
