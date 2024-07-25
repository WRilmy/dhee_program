package edu.hit.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Capping {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer tId;
    private Integer cappingLineFee;
    private Integer medicalPersonnelCategory;
}
