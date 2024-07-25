package edu.hit.controller;

import edu.hit.common.Result;
import edu.hit.mapper.DiseaseMapper;
import edu.hit.pojo.Disease;
import edu.hit.pojo.Medicine;
import edu.hit.service.DiseaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/disease")
public class DiseaseController {
    @Autowired
    private DiseaseService diseaseService;
    @GetMapping
    public Result list(){
        log.info("查询病种");
        List<Disease> diseases = diseaseService.list();
        return Result.success(diseases);
    }
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id) {
        log.info("根据id删除病种:{} ", id);
        diseaseService.removeById(id);
        return Result.success();
    }
    @PostMapping
    public Result add(@RequestBody Disease disease) {
        log.info("新增病种：{}", disease);
        diseaseService.save(disease);
        return Result.success();
    }
    @PutMapping
    public Result update(@RequestBody Disease disease){
        log.info("更新病种");
        diseaseService.updateById(disease);
        return Result.success();
    }


}
