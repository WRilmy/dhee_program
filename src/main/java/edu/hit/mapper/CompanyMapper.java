package edu.hit.mapper;

import edu.hit.pojo.Company;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CompanyMapper {

    /*
    删除单位
    */
    @Delete("delete from medicare.company where company_id= #{companyId}")
    void delete(Integer company_id );

    /*
    新增单位
    */
    @Insert("insert into medicare.company(company_name, company_type, address, postcode, phone_number) VALUES (#{companyName},#{companyType},#{address},#{postcode},#{phoneNumber})")
    void add(Company company);

    /*
    根据id查询单位
    */
    @Select("select * from medicare.company where company_id=#{companyId}")
    Company selectById(Integer company_id);

    /*
    修改单位
    */
    @Update("update medicare.company set company_name=#{companyName} where company_id=#{companyId}")
    void update(Company company);

}
