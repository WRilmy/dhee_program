package edu.hit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.hit.mapper.PeopleMapper;
import edu.hit.pojo.People;
import edu.hit.service.PeopleService;
import org.springframework.stereotype.Service;

@Service
public class PeopleServiceimpl extends ServiceImpl<PeopleMapper, People> implements PeopleService {
}
