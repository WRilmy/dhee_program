package edu.hit.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import edu.hit.common.Result;
import edu.hit.pojo.*;
import edu.hit.service.PeopleService;
import edu.hit.service.PrescriptionService;
import edu.hit.service.VisitInformationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@Slf4j
@RequestMapping("/Baoxiao")
public class BaoxiaoController {
    @Autowired
    private PeopleService peopleService;
    @Autowired
    private PrescriptionService prescriptionService;//处方
    @Autowired
    private VisitInformationService visitInformationService;//就诊



    @GetMapping
    public Result page(Integer page,
                       Integer pageSize,
                       String name,String id){
        LambdaQueryWrapper<People> queryWrapper= new LambdaQueryWrapper<>();
        queryWrapper.like(name!=null,People::getName,name);
        queryWrapper.like(id!=null,People::getId,id);
        Page<People>  pageInfo=new Page<>(page,pageSize);
        Page<People> result= peopleService.page(pageInfo , queryWrapper);
        PageBean pageBean = new PageBean(result.getTotal(), result.getRecords());
        return Result.success(pageBean);
    }

    @PostMapping
    public Result add(@RequestBody VisitInformation visitInformation){
        visitInformationService.save(visitInformation);
        return Result.success();
    }
    public Result add(@RequestBody Prescription prescription) {
        prescriptionService.save(prescription);
        return Result.success();
    }
}
