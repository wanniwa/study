package com.waniwa.study;

import com.waniwa.study.domain.Result;
import com.waniwa.study.utils.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result  handle(Exception e){
        return ResultUtil.error(100,e.getMessage());
    }
}
