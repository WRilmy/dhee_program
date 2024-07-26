package edu.hit.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.hit.mapper.CompanyMapper;
import edu.hit.pojo.Company;
import edu.hit.service.CompanyService;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company>implements CompanyService {
}
