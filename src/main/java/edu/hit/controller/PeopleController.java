package edu.hit.controller;

import edu.hit.common.Result;
import edu.hit.pojo.People;
import edu.hit.pojo.Ratio;
import edu.hit.service.PeopleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/people")
public class PeopleController {
    @Autowired
    private PeopleService peopleService;
    @GetMapping
    public Result list(){
        log.info("查询人员");
        List<People> peoples = peopleService.list();
        return Result.success(peoples);
    }
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id) {
        log.info("根据id删除人员:{} ", id);
        peopleService.removeById(id);
        return Result.success();
    }
    @PostMapping
    public Result add(@RequestBody People people) {
        log.info("新增人员：{}", people);
        peopleService.save(people);
        return Result.success();
    }
    @PutMapping
    public Result update(@RequestBody People people){
        log.info("更新人员");
        peopleService.updateById(people);
        return Result.success();
    }
}
