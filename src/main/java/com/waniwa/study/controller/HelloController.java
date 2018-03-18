package com.waniwa.study.controller;

import com.waniwa.study.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
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


    @RequestMapping(value = "/say/{id}",method = RequestMethod.GET)
    public Integer hello(@PathVariable("id") Integer id){
        return id;
    }
}

