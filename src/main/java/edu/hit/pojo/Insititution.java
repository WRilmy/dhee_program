package edu.hit.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Insititution {
    private Integer diaId;
    private String diaName;
    private Integer diaExpType;
    private Integer diaExpLevel;
    private Integer diaMaxPrize;
    private LocalDateTime diaStarttime;
    private LocalDateTime diaEndtime;
    private Integer diaValid;
    private Integer diaHosLevel;
    private Integer diaApprovalmark;
}
