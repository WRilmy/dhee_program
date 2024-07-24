package edu.hit.service;

import edu.hit.pojo.PageBean;

public interface MedicineService {

    PageBean page(Integer page, Integer pageSize, String name, Object o, Object o1);


}
