package edu.hit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fasterxml.jackson.databind.ser.Serializers;
import edu.hit.pojo.Capping;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
//@Component
public interface CappingMapper extends BaseMapper<Capping> {
}
