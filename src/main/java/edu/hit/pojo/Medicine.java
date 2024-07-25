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
public class Medicine {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer mId;
    private String medId;
    private String medName;
    private Integer medExpType;
    private Integer medExpLevel;
    private String medMeasurement;
    private Integer medMaxPrize;
    private Integer medApprovalmark;
    private Integer medHosLevel;
    private String medSize;
    private String medTradename;
    private LocalDateTime medStarttime;
    private LocalDateTime medEndtime;
    private Integer medValid;
    private Integer medSpecialmark;
}
