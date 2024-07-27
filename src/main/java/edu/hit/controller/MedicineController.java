package edu.hit.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import edu.hit.common.Result;
import edu.hit.pojo.Medicine;
import edu.hit.pojo.PageBean;
import edu.hit.service.MedicineService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Slf4j
@RequestMapping("/classes")
public class MedicineController {
    @Autowired
    private MedicineService medicineService;
    @GetMapping
    public Result page(Integer page, Integer pageSize,
                       String name, String id) {
        LambdaQueryWrapper<Medicine> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(name != null, Medicine::getMedName, name)
                    .like(id != null, Medicine::getMedId, id);
        Page<Medicine> pageInfo = new Page<>(page, pageSize);
        Page<Medicine> result = medicineService.page(pageInfo, queryWrapper);
        PageBean pageBean = new PageBean(result.getTotal(), result.getRecords());
        log.info("查询药品，{},{}, {}",pageBean.getTotal(), pageInfo.getTotal(), pageInfo);
        return Result.success(pageBean);
    }
//    @GetMapping
//    public Result list(){
//    log.info("查询药品");
//    List<Medicine> medicines = medicineService.list();
//    return Result.success(medicines);
//    }

    @GetMapping("/{id}")
    public Result selectById(@PathVariable Integer id){
        Medicine medicine=medicineService.getById(id);
        return Result.success(medicine);

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
