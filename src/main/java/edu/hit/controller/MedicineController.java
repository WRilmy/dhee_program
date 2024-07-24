package edu.hit.controller;

import edu.hit.mapper.MedicineMapper;
import edu.hit.pojo.PageBean;
import edu.hit.service.MedicineService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import edu.hit.pojo.Result;
import edu.hit.pojo.Medicine;
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
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        log.info("根据id删除药品:{} ", id);
        medicineService.delete(id);
        return Result.success();
    }
    @PostMapping
    public Result add(@RequestBody Medicine medicine) {
        log.info("新增药品：{}", medicine);
        medicineService.add(medicine);
        return Result.success();
    }
    @PutMapping
    public Result update(@RequestBody Medicine medicine){
        log.info("更新药品");
        medicineService.update(medicine);
        return Result.success();
    }
}
