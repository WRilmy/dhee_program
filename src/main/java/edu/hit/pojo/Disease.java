package edu.hit.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Disease {
    private Integer diseaseId;
    private String diseaseName;
    private Integer diseaseType;
    private Integer diseaseReimbursementStandards;
    private String notes;
}
