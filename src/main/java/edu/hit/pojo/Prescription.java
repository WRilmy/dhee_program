package edu.hit.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*

处方实体类

*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prescription {
    @TableId(value = "t_id", type = IdType.AUTO)
    private Integer tId;
    private int hospitalizationNumber;
    private int chargeableItemsCategory;
    private int projectCodeing;
    private String projectName;
    private int  unitPrice;
    private int quantity;
    private int  amount;
}
