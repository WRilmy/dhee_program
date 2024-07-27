package edu.hit.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import edu.hit.common.Result;
import edu.hit.pojo.PageBean;
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
    public Result page(Integer page,
                      Integer pageSize,
                       String name, String id) {
        LambdaQueryWrapper<Ratio> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(name != null, Ratio::getReimbursementProportion, name);
        queryWrapper.like(id != null, Ratio::getTId, id);
        Page<Ratio> pageInfo = new Page<>(page, pageSize);
        Page<Ratio> result = ratioService.page(pageInfo, queryWrapper);
        PageBean pageBean = new PageBean(result.getTotal(), result.getRecords());
        return Result.success(pageBean);
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
