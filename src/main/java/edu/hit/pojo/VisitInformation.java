package edu.hit.pojo;


/*

人员就诊信息实体类

*/

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VisitInformation {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer tId;
    private int personId;
    private int hospitalizationNumber;
    private int designatedNumber;
    private int medicalCategory;
    private LocalDate admissionDate;
    private LocalDate dischargeDate;
    private int diseaseCode;
    private int hospitalGrade;
    private int admissionCode;
    private String diagnosedName;
    private String dischargeReason;
    private int settlementFlag;

}
