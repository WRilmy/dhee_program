package edu.hit.controller;

import edu.hit.common.Result;
import edu.hit.pojo.Capping;
import edu.hit.pojo.Medicine;
import edu.hit.service.CappingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/capping")
public class CappingController {
    @Autowired
    private CappingService cappingService;
    @GetMapping
    public Result list(){
        log.info("查询封顶线");
        List<Capping> cappings = cappingService.list();
        return Result.success(cappings);
    }
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id) {
        log.info("根据id删除封顶线:{} ", id);
        cappingService.removeById(id);
        return Result.success();
    }
    @PostMapping
    public Result add(@RequestBody Capping capping) {
        log.info("新增封顶线：{}", capping);
        cappingService.save(capping);
        return Result.success();
    }
    @PutMapping
    public Result update(@RequestBody Capping capping){
        log.info("更新封顶线");
        cappingService.updateById(capping);
        return Result.success();
    }
}
