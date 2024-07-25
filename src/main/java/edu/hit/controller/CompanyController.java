package edu.hit.controller;



import edu.hit.pojo.Company;
import edu.hit.common.Result;
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
    @DeleteMapping("/{company_id}")
    public Result delete(@PathVariable Integer company_id) {
        log.info("根据id删除公司:{} ", company_id);
        companyService.delete(company_id);
        return Result.success();
    }
    @GetMapping("/{company_id}")
    public Result selectById(@PathVariable Integer company_id){
            log.info("根据id查询公司:{} ", company_id);
        Company company=companyService.selectById(company_id);
        return Result.success(company);
    }
    @PutMapping
    public Result add(@RequestBody Company company){
        companyService.add(company);
        return Result.success();
    }
    @PostMapping
    public Result update(@RequestBody Company company){
        log.info("修改公司");
        companyService.update(company);
        return Result.success();
    }

}
