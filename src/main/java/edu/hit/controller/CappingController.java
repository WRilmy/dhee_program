package edu.hit.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import edu.hit.common.Result;
import edu.hit.pojo.Capping;
import edu.hit.pojo.Disease;
import edu.hit.pojo.Medicine;
import edu.hit.pojo.PageBean;
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
    public Result page(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer pageSize,
                       String name, String id) {
        LambdaQueryWrapper<Capping> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(name != null, Capping::getCappingLineFee, name);
        queryWrapper.like(id != null, Capping::getTId, id);
        Page<Capping> pageInfo = new Page<>(page, pageSize);
        Page<Capping> result = cappingService.page(pageInfo, queryWrapper);
        PageBean pageBean = new PageBean(result.getTotal(), result.getRecords());
        return Result.success(pageBean);
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
