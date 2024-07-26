package edu.hit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.hit.mapper.ExpensesInformationMapper;
import edu.hit.pojo.ExpensesInformation;
import edu.hit.service.ExpensesInformationService;
import org.springframework.stereotype.Service;

@Service
public class ExpensesInformationImpl extends ServiceImpl<ExpensesInformationMapper, ExpensesInformation> implements ExpensesInformationService {
}
