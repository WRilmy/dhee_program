package edu.hit.service;

import edu.hit.pojo.PageBean;

import java.time.LocalDate;

public interface MedicineService {

    PageBean page(Integer page, Integer pageSize, String name, LocalDate begin, LocalDate end);


}
