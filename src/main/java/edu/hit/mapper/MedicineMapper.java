package edu.hit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.hit.pojo.Medicine;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MedicineMapper extends BaseMapper<Medicine> {
}
