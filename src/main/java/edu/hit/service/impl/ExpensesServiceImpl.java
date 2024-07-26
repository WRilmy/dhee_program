package edu.hit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.hit.mapper.ExpensesMapper;
import edu.hit.pojo.Expenses;
import edu.hit.service.ExpensesService;
import org.springframework.stereotype.Service;

@Service
public class ExpensesServiceImpl extends ServiceImpl<ExpensesMapper, Expenses> implements ExpensesService {
}
