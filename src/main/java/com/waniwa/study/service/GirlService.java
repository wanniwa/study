package com.waniwa.study.service;

import com.waniwa.study.domain.Girl;
import com.waniwa.study.repository.GirlRepository;
import enums.ResultEnum;
import exception.GirlException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wanniwa
 * @date 2018/3/18 0:15
 */
@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    @Transactional(rollbackFor = Exception.class)
    public void  insertTwo(){
        Girl girl = new Girl();
        girl.setAge(15);
        girl.setCupSize("P");

        girlRepository.save(girl);
        Girl girl1 = new Girl();
        girl1.setAge(15);
        girl1.setCupSize("EEE");
        girlRepository.save(girl1);
    }
    public void getAge(Integer id) throws Exception{
        Girl girl = girlRepository.getOne(id);
        Integer age = girl.getAge();
        if (age < 10) {
            //返回"你还在上小学吧" code=100
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        }else if (age > 10 && age < 16) {
            //返回"你可能在上初中" code=101
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }

        //如果>16岁,加钱
        //...
    }
}
