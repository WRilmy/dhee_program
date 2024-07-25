package edu.hit.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer dId;
    private String diaId;
    private String diaName;
    private Integer diaExpType;
    private Integer diaExpLevel;
    private LocalDateTime diaStarttime;
    private LocalDateTime diaEndtime;
    private Integer diaValid;
    private Integer diaHosLevel;
    private Integer diaApprovalmark;
}
