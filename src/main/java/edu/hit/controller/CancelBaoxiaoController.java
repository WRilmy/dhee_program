package edu.hit.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import edu.hit.common.Result;
import edu.hit.pojo.PageBean;
import edu.hit.pojo.VisitInformation;
import edu.hit.service.VisitInformationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@Slf4j
@RequestMapping("/CancelBaoxiao")
public class CancelBaoxiaoController {
    @Autowired
    private VisitInformationService visitInformationService;

    @GetMapping
    public Result page(@RequestParam(defaultValue = "1")Integer page,
                       @RequestParam(defaultValue = "10")Integer pageSize,
                       String number){
        LambdaQueryWrapper<VisitInformation> queryWrapper= new LambdaQueryWrapper<>();
        queryWrapper.like(number!=null,VisitInformation::getHospitalizationNumber,number);
        Page<VisitInformation> pageInfo=new Page<>(page,pageSize);
        Page<VisitInformation> result= visitInformationService.page(pageInfo,queryWrapper);
        PageBean pageBean = new PageBean(result.getTotal(), result.getRecords());
        return Result.success(pageBean);
    }
    @DeleteMapping("/{tId}")
    public Result deleteById(@PathVariable Integer tId){
        visitInformationService.removeById(tId);
        return Result.success();
    }
}
