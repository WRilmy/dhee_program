package edu.hit.controller;

import edu.hit.mapper.MedicineMapper;
import edu.hit.pojo.PageBean;
import edu.hit.service.MedicineService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import edu.hit.pojo.Result;

import java.time.LocalDate;

@RestController
@Slf4j
@RequestMapping("/medicine")
public class MedicineController {
    @Autowired
    private MedicineService medicineService;
    @GetMapping
    public Result page(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer pageSize,
                       String name,
                       String finishTime) {
        PageBean pageBean = medicineService.page(page, pageSize, name, null, null);
        if (finishTime != null && !finishTime.equals("undefined")) {
            String[] dates = finishTime.split(",");
            LocalDate begin = LocalDate.parse(dates[0]);
            LocalDate end = LocalDate.parse(dates[1]);
            log.info("分页查询，参数:{},{},{},{},{}", page, pageSize,name,begin,end);
            pageBean = medicineService.page(page, pageSize, name, begin, end);
        }
        return Result.success(pageBean);
    }
}
