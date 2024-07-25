package edu.hit.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ratio {
    private Integer tId;
    private Integer medicalCategory;
    private Integer medicalPersonnelCategory;
    private Integer hospitalLevel;
    private Integer maximumAmount;
    private Integer minimumAmount;
    private String reimbursementProportion;
}
