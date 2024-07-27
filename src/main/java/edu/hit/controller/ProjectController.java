package edu.hit.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import edu.hit.common.Result;
import edu.hit.pojo.Medicine;
import edu.hit.pojo.PageBean;
import edu.hit.pojo.Project;
import edu.hit.service.ProjectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    private ProjectService projectService;
    @GetMapping
    public Result page(Integer page,
                        Integer pageSize,
                       String name, String id) {
        LambdaQueryWrapper<Project> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(name != null, Project::getDiaName, name);
        queryWrapper.like(id != null, Project::getDiaId, id);
        Page<Project> pageInfo = new Page<>(page, pageSize);
        Page<Project> result = projectService.page(pageInfo, queryWrapper);
        PageBean pageBean = new PageBean(result.getTotal(), result.getRecords());
        log.info("查询项目");
        return Result.success(pageBean);
    }


    @GetMapping("/{id}")
    public Result selectById(@PathVariable Integer id){
        return Result.success(projectService.getById(id));
    }


    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id) {
        log.info("根据id删除项目:{} ", id);
        projectService.removeById(id);
        return Result.success();
    }
    @PostMapping
    public Result add(@RequestBody Project project) {
        log.info("新增自费比例：{}", project);
        projectService.save(project);
        return Result.success();
    }
    @PutMapping
    public Result update(@RequestBody Project project){
        log.info("更新自费比例");
        projectService.updateById(project);
        return Result.success();
    }
}
