package edu.hit.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import edu.hit.common.Result;
import edu.hit.pojo.Facilities;
import edu.hit.pojo.Insititution;
import edu.hit.pojo.Medicine;
import edu.hit.pojo.PageBean;
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
    public Result page(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer pageSize,
                       String name, String id) {
        LambdaQueryWrapper<Insititution> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(name != null, Insititution::getInsName, name);
        queryWrapper.like(id != null, Insititution::getInsId, id);
        Page<Insititution> pageInfo = new Page<>(page, pageSize);
        Page<Insititution> result = insititutionService.page(pageInfo, queryWrapper);
        PageBean pageBean = new PageBean(result.getTotal(), result.getRecords());
        return Result.success(pageBean);
    }



    @GetMapping("/{id}")
    public Result selectById(@PathVariable Integer id){

        return Result.success(insititutionService.getById(id));

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
