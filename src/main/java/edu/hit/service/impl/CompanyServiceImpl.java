package edu.hit.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import edu.hit.mapper.CompanyMapper;
import edu.hit.pojo.Company;
import edu.hit.pojo.PageBean;
import edu.hit.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company>implements CompanyService {
}
