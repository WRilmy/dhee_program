package edu.hit.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import edu.hit.common.Result;
import edu.hit.pojo.Capping;
import edu.hit.pojo.Medicine;
import edu.hit.pojo.PageBean;
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
    public Result page(Integer page,
                       Integer pageSize,
                       String name, String id) {
        LambdaQueryWrapper<Standard> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(name != null, Standard::getMinimumPaymentStandard, name);
        queryWrapper.like(id != null, Standard::getTId, id);
        Page<Standard> pageInfo = new Page<>(page, pageSize);
        Page<Standard> result = standardService.page(pageInfo, queryWrapper);
        PageBean pageBean = new PageBean(result.getTotal(), result.getRecords());
        return Result.success(pageBean);
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
