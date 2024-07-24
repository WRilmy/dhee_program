package edu.hit.mapper;

import edu.hit.pojo.Medicine;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface MedicineMapper {

    List<Medicine> list(String name, LocalDate begin, LocalDate end);

    @Delete("delete from medicare.t_medicine where m_id = #{id}")
    void delete(Integer id);

    @Insert("insert into medicare.t_medicine (med_id, med_name, med_exp_type, med_exp_level, med_measurement, med_max_prize, med_approvalmark, med_hos_level, med_size, med_tradename, med_starttime, med_endtime, med_valid, med_specialmark) " +
            "VALUES (#{med_id},#{med_name},#{med_exp_type},#{med_exp_level},#{med_measurement},#{med_max_prize},#{med_approvalmark},#{med_hos_level},#{med_size},#{med_tradename},#{med_starttime},#{med_endtime},#{med_valid},#{med_specialmark})")
    void add(Medicine medicine);

    void update(Medicine medicine);
}
