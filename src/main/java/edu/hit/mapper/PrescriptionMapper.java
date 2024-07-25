package edu.hit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.hit.pojo.Prescription;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface PrescriptionMapper extends BaseMapper<Prescription> {
}
