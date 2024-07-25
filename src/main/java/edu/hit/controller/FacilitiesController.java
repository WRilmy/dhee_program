package edu.hit.controller;

import edu.hit.common.Result;
import edu.hit.pojo.Facilities;
import edu.hit.service.FacilitiesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/facilities")
public class FacilitiesController {
    @Autowired
    private FacilitiesService facilitiesService;
    @GetMapping
    public Result list(){
        log.info("查询自费比例");
        List<Facilities> facilities = facilitiesService.list();
        return Result.success(facilities);
    }
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id) {
        log.info("根据id删除自费比例:{} ", id);
        facilitiesService.removeById(id);
        return Result.success();
    }
    @PostMapping
    public Result add(@RequestBody Facilities facilities) {
        log.info("新增自费比例：{}", facilities);
        facilitiesService.save(facilities);
        return Result.success();
    }
    @PutMapping
    public Result update(@RequestBody Facilities facilities){
        log.info("更新自费比例");
        facilitiesService.updateById(facilities);
        return Result.success();
    }
}
