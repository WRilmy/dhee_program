package edu.hit.service;

import edu.hit.pojo.Medicine;
import edu.hit.pojo.PageBean;

import java.time.LocalDate;

public interface MedicineService {

    PageBean page(Integer page, Integer pageSize, String name, LocalDate begin, LocalDate end);


    void delete(Integer id);

    void add(Medicine medicine);

    void update(Medicine medicine);
}
