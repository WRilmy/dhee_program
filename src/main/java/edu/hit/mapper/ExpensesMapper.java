package edu.hit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.hit.pojo.Expenses;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ExpensesMapper extends BaseMapper<Expenses> {
}
