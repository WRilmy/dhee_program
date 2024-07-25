package edu.hit.pojo;

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
    private Integer tId;
    private int hospitalizationNumber;

    private int chargeableItemsCategory;
    private int projectCodeing;
    private int projectName;
    private int  unitPrice;
    private int quantity;
    private int  amount;

}
