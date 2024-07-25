package edu.hit.controller;

import edu.hit.common.Result;
import edu.hit.pojo.Insititution;
import edu.hit.pojo.Medicine;
import edu.hit.service.InsititutionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/insititution")
public class InsititutionController {
    @Autowired
    private InsititutionService insititutionService;

    @GetMapping
    public Result list() {
        log.info("查询定点医疗机构");
        List<Insititution> insititutions = insititutionService.list();
        return Result.success(insititutions);
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id) {
        log.info("根据id删除定点医疗机构");
        insititutionService.removeById(id);
        return Result.success();
    }
    @PostMapping
    public Result add(@RequestBody Insititution insititution) {
        log.info("新增机构：{}", insititution);
        insititutionService.save(insititution);
        return Result.success();
    }
    @PutMapping
    public Result update(@RequestBody Insititution insititution){
        log.info("更新机构");
        insititutionService.updateById(insititution);
        return Result.success();
    }
}
