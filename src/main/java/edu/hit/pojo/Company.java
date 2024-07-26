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
    private Integer id;
    private String companyId;
    private String companyName;//单位名称
    private int companyType;//单位类型
    private String address;//地址
    private int postcode;//邮编
    private int phoneNumber;//电话号码

}
