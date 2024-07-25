package edu.hit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.hit.pojo.People;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PeopleMapper extends BaseMapper<People> {
}
