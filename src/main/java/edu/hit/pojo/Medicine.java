package edu.hit.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Medicine {
    private Integer mId;
    private String medName;
    private Integer medExpType;
    private Integer medExpLevel;
    private String medMeasurement;
    private Integer medMaxPrize;
    private Integer medApprovalmark;
    private Integer medHosLevel;
    private Integer medSize;
    private Integer medTradename;
    private LocalDateTime medStartTime;
    private LocalDateTime medEndTime;
    private Integer medValid;
    private Integer medSpecialmark;
}
