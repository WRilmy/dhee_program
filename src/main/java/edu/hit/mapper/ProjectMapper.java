package edu.hit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.hit.pojo.Project;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProjectMapper extends BaseMapper<Project> {
}
