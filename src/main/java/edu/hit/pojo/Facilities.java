package edu.hit.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Facilities {
    @TableId(value = "ser_id", type = IdType.AUTO)
    private Integer serId;
    private String serName;
    private Integer serExpType;
    private LocalDate serStarttime;
    private LocalDate serEndtime;
    private Integer serValid;
}
