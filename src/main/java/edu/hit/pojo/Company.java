package edu.hit.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*

单位实体类

*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer company_id;
    private String company_name;//单位名称
    private int company_type;//单位类型
    private String address;//地址
    private int postcode;//邮编
    private int phone_number;//电话号码

}
