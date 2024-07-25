package edu.hit.controller;

import edu.hit.common.Result;
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
    public Result list(){
        log.info("查询自费比例");
        List<Project> projects = projectService.list();
        return Result.success(projects);
    }
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id) {
        log.info("根据id删除自费比例:{} ", id);
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
