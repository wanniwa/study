package com.waniwa.study.controller;

import com.waniwa.study.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author wanniwa
 * @date 2018/3/17 19:06
 */
@RestController
@RequestMapping("hello")
public class HelloController {
    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping("/")
    public String index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("name", "wanniwa");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";
    }


    @RequestMapping(value = "/say/{id}", method = RequestMethod.GET)
    public Integer hello(@PathVariable("id") Integer id) {
        return id;
    }
}

