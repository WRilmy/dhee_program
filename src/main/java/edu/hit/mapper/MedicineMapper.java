package edu.hit.mapper;

import edu.hit.pojo.Medicine;
import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDate;
import java.util.List;

@Mapper

public interface MedicineMapper {

    List<Medicine> list(String name, LocalDate begin, LocalDate end);
}
