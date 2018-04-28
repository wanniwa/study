package com.waniwa.study.controller;

import com.waniwa.study.service.GirlService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 廖师兄
 * 2016-11-03 23:15
 */
@RestController
public class GirlController {

    private final static Logger logger = LoggerFactory.getLogger(GirlController.class);



    @Autowired
    private GirlService girlService;

}
