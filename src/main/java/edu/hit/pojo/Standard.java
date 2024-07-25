package edu.hit.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Standard {
    private Integer tId;
    private Integer medicalCategory;
    private Integer medicalPersonnelCategory;
    private Integer hospitalLevel;
    private Integer minimumPaymentStandard;
}
