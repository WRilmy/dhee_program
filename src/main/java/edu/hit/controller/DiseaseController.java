package edu.hit.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import edu.hit.common.Result;
import edu.hit.mapper.DiseaseMapper;
import edu.hit.pojo.Disease;
import edu.hit.pojo.Insititution;
import edu.hit.pojo.Medicine;
import edu.hit.pojo.PageBean;
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
    public Result page(Integer page,
                        Integer pageSize,
                       String name, String id) {
        LambdaQueryWrapper<Disease> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(name != null, Disease::getDiseaseName, name);
        queryWrapper.like(id != null, Disease::getDiseaseId, id);
        Page<Disease> pageInfo = new Page<>(page, pageSize);
        Page<Disease> result = diseaseService.page(pageInfo, queryWrapper);
        PageBean pageBean = new PageBean(result.getTotal(), result.getRecords());
        return Result.success(pageBean);
    }

    @GetMapping("/{id}")
    public Result selectById(@PathVariable Integer id){

        return Result.success(diseaseService.getById(id));

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
