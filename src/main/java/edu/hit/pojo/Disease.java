package edu.hit.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Disease {
    @TableId(value = "disease_id", type = IdType.AUTO)
    private Integer diseaseId;
    private String diseaseName;
    private Integer diseaseType;
    private Integer diseaseReimbursementStandards;
    private String notes;
}
