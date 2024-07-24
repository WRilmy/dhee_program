package edu.hit.service.impl;


import edu.hit.mapper.CompanyMapper;
import edu.hit.pojo.Company;
import edu.hit.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceimpl implements CompanyService {
    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public  void delete(Integer company_id){companyMapper.delete(company_id);}

    @Override
    public void add(Company company){
        companyMapper.add(company);
    }

    @Override
    public Company selectById(Integer company_id) {return companyMapper.selectById(company_id);}

    @Override
    public void update(Company company) {
    companyMapper.update(company);
    }
}
