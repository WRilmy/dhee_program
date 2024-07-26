package edu.hit.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import edu.hit.common.Result;
import edu.hit.pojo.Facilities;
import edu.hit.pojo.PageBean;
import edu.hit.pojo.Project;
import edu.hit.service.FacilitiesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/facilities")
public class FacilitiesController {
    @Autowired
    private FacilitiesService facilitiesService;
    @GetMapping
    public Result page(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer pageSize,
                       String name, String id) {
        LambdaQueryWrapper<Facilities> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(name != null, Facilities::getSerName, name);
        queryWrapper.like(id != null, Facilities::getSerId, id);
        Page<Facilities> pageInfo = new Page<>(page, pageSize);
        Page<Facilities> result = facilitiesService.page(pageInfo, queryWrapper);
        PageBean pageBean = new PageBean(result.getTotal(), result.getRecords());
        return Result.success(pageBean);
    }
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id) {
        log.info("根据id删除自费比例:{} ", id);
        facilitiesService.removeById(id);
        return Result.success();
    }
    @PostMapping
    public Result add(@RequestBody Facilities facilities) {
        log.info("新增自费比例：{}", facilities);
        facilitiesService.save(facilities);
        return Result.success();
    }
    @PutMapping
    public Result update(@RequestBody Facilities facilities){
        log.info("更新自费比例");
        facilitiesService.updateById(facilities);
        return Result.success();
    }
}
