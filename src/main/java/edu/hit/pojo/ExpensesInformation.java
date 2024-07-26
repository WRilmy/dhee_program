package edu.hit.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
年度费用信息实体类
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExpensesInformation {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String peopleId;
    private String year;
    private int reimbursementTimes;
    private  int medicalExpenses;
    private int medicareExpenses;
    private int personalExpenses;
}
