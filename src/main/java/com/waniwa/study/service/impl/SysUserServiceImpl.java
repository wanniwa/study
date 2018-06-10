package com.waniwa.study.service.impl;

import com.waniwa.study.pojo.SysUser;
import com.waniwa.study.repository.SysUserRepository;
import com.waniwa.study.service.ISysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 王宁
 * @date 2018/5/11 1:18
 */
@Service
public class SysUserServiceImpl implements ISysUserService {
    @Resource
    private SysUserRepository userRepository;

    @Override
    public SysUser findByAccount(String account) {
        System.out.println("UserInfoServiceImpl.findByAccount()");
        return userRepository.findByAccount(account);
    }
}
