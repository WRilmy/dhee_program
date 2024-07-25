package edu.hit.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Insititution {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String insId;
    private String insName;
    private Integer hosLevel;
    private Integer hosType;
    private Integer postcode;
    private String bossName;
    private String bossPhonenumber;
    private String peopleName;
    private String peoplePhonenumber;
    private String peopleMobilephone;
    private String address;
    private String notes;
}
