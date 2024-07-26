package edu.hit.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Expenses {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private int allExpenses;
    private int baoxiaoExpenses;
    private int zifeiExpenses;
    private int reimbursementExpenses;
    private int minimumPaymentStandard;
    private int fenduanzifeijine;
    private int cappingline;
    private int yileizifeiExpenses;
    private int tejiantezhizifeiExpense;
}
