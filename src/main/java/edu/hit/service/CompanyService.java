package edu.hit.service;

import edu.hit.pojo.Company;
import edu.hit.pojo.PageBean;


import java.util.List;

public interface CompanyService {
    void delete(Integer company_id );


    void add(Company company);

    Company selectById(Integer company_id);

    void update(Company company);

    PageBean page(Integer page, Integer pageSize, String company_name);

    List<Company> list();

}
