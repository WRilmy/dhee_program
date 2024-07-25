package edu.hit.controller;

import edu.hit.common.Result;
import edu.hit.pojo.Ratio;
import edu.hit.pojo.Standard;
import edu.hit.service.RatioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/ratio")
public class RatioController {
    @Autowired
    private RatioService ratioService;
    @GetMapping
    public Result list(){
        log.info("查询自费比例");
        List<Ratio> ratios = ratioService.list();
        return Result.success(ratios);
    }
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id) {
        log.info("根据id删除自费比例:{} ", id);
        ratioService.removeById(id);
        return Result.success();
    }
    @PostMapping
    public Result add(@RequestBody Ratio ratio) {
        log.info("新增自费比例：{}", ratio);
        ratioService.save(ratio);
        return Result.success();
    }
    @PutMapping
    public Result update(@RequestBody Ratio ratio){
        log.info("更新自费比例");
        ratioService.updateById(ratio);
        return Result.success();
    }
}
