package edu.hit.controller;
import edu.hit.common.Result;
import edu.hit.pojo.Company;
import edu.hit.service.CompanyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@Slf4j
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

//根据id删除
    @DeleteMapping("/company_id")
    public Result deleteById(@PathVariable Integer company_id){
        companyService.removeById(company_id);
        return Result.success();
    }
    //查询
    @GetMapping
    public Result list(){
        return Result.success(companyService.list());
    }
    @PostMapping
    public Result add(@RequestBody Company company){
        companyService.save(company);
        return Result.success();
    }
    @PutMapping
    public Result update(@RequestBody Company company){
        companyService.updateById(company);
        return Result.success();
    }

}
