package edu.hit.controller;

import edu.hit.common.Result;
import edu.hit.pojo.Medicine;
import edu.hit.pojo.Standard;
import edu.hit.service.StandardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/standard")
public class StandardController {
    @Autowired
    private StandardService standardService;
    @GetMapping
    public Result list(){
        log.info("查询标准");
        List<Standard> standards = standardService.list();
        return Result.success(standards);
    }
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id) {
        log.info("根据id删除标准:{} ", id);
        standardService.removeById(id);
        return Result.success();
    }
    @PostMapping
    public Result add(@RequestBody Standard standard) {
        log.info("新增标准：{}", standard);
        standardService.save(standard);
        return Result.success();
    }
    @PutMapping
    public Result update(@RequestBody Standard standard){
        log.info("更新标准");
        standardService.updateById(standard);
        return Result.success();
    }
}
