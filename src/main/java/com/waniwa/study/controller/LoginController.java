package com.waniwa.study.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 王宁
 * @date 2018/4/28 16:56
 */
@Controller
public class LoginController {
    /** logger */
    private static final Logger log = LoggerFactory.getLogger(LoginController.class);
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("name","ning");
        return "account/index";
    }
}
