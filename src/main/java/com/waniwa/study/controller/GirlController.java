package com.waniwa.study.controller;

import com.waniwa.study.domain.Girl;
import com.waniwa.study.domain.Result;
import com.waniwa.study.repository.GirlRepository;
import com.waniwa.study.service.GirlService;
import com.waniwa.study.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author wanniwa
 * @date 2018/3/17 23:49
 */
@RestController
public class GirlController {
    @Autowired
    private GirlRepository girlRepository;
    @Autowired
    private GirlService girlService;
    /**
     * 查询所有女生
     *
     * @return
     */
    @GetMapping(value = "/girls")
    public List<Girl> girlList() {
        return girlRepository.findAll();
    }

    /**
     * 添加一个女生
     * @param girl
     * @param
     * @return
     */
    @PostMapping(value = "/girls")
    public Result<Girl> girlAdd(@Valid Girl girl, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultUtil.error(1,bindingResult.getFieldError().getDefaultMessage());
        }

        return ResultUtil.success(girlRepository.save(girl));
    }

    @PostMapping(value = "/girls/{id}")
    public Girl girlAdd(@PathVariable("id") Integer id,
                        @RequestParam("cupSize") String cupSize,
                        @RequestParam("age") Integer age) {
        Girl girl = new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return girlRepository.save(girl);
    }

    @GetMapping(value = "/girls/{age}")
    public List<Girl> girlAdd(@PathVariable("age") Integer age) {
        return girlRepository.findByAge(age);
    }
    @PostMapping(value = "/girls/two")
    public void girlTwo(){
        girlService.insertTwo();
    }

    @GetMapping(value = "girls/getAge/{id}")
    public void getAge(@PathVariable("id") Integer id) throws Exception{
        girlService.getAge(id);
    }
}
