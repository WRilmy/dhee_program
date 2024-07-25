package edu.hit.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ratio {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer tId;
    private Integer medicalCategory;
    private Integer medicalPersonnelCategory;
    private Integer hospitalLevel;
    private Integer maximumAmount;
    private Integer minimumAmount;
    private String reimbursementProportion;
}
