package edu.hit.controller;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import edu.hit.common.Result;
import edu.hit.pojo.Company;
import edu.hit.pojo.PageBean;
import edu.hit.pojo.Ratio;
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
    public Result deleteById(@PathVariable Integer companyId){
        companyService.removeById(companyId);
        return Result.success();
    }
    //查询
    @GetMapping
    public Result page(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer pageSize,
                       String name, String id) {
        LambdaQueryWrapper<Company> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(name != null, Company::getCompanyName, name);
        queryWrapper.like(id != null, Company::getCompanyId, id);
        Page<Company> pageInfo = new Page<>(page, pageSize);
        Page<Company> result = companyService.page(pageInfo, queryWrapper);
        PageBean pageBean = new PageBean(result.getTotal(), result.getRecords());
        return Result.success(pageBean);
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
