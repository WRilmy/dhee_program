package edu.hit.service;

import edu.hit.pojo.Company;

public interface CompanyService {
    void delete(Integer company_id );


    void add(Company company);

    Company selectById(Integer company_id);

    void update(Company company);

}
