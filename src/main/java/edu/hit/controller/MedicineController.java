package edu.hit.controller;

import edu.hit.common.Result;
import edu.hit.pojo.Medicine;
import edu.hit.service.MedicineService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/medicine")
public class MedicineController {
    @Autowired
    private MedicineService medicineService;
//    @GetMapping
//    public Result page(@RequestParam(defaultValue = "1") Integer page,
//                       @RequestParam(defaultValue = "10") Integer pageSize,
//                       String name) {
//        LambdaQueryWrapper<Medicine> queryWrapper = new LambdaQueryWrapper<>();
//        queryWrapper.like(!name.isEmpty(), Medicine::getMedName, name);
//        Page<Medicine> pageInfo = new Page<>(page, pageSize);
//        Page<Medicine> result = medicineService.page(pageInfo, queryWrapper);
//        PageBean pageBean = new PageBean(result.getTotal(), result.getRecords());
//        return Result.success(pageBean);
//    }
    @GetMapping
    public Result list(){
        log.info("查询药品");
        List<Medicine> medicines = medicineService.list();
        return Result.success(medicines);
    }
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id) {
        log.info("根据id删除药品:{} ", id);
        medicineService.removeById(id);
        return Result.success();
    }
    @PostMapping
    public Result add(@RequestBody Medicine medicine) {
        log.info("新增药品：{}", medicine);
        medicineService.save(medicine);
        return Result.success();
    }
    @PutMapping
    public Result update(@RequestBody Medicine medicine){
        log.info("更新药品");
        medicineService.updateById(medicine);
        return Result.success();
    }
}
