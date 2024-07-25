package edu.hit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.hit.pojo.Disease;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DiseaseMapper extends BaseMapper<Disease> {
}
