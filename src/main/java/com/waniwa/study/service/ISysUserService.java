package com.waniwa.study.service;

import com.waniwa.study.domain.SysUser;

/**
 * @author 王宁
 * @date 2018/5/11 1:18
 */
public interface ISysUserService {
    SysUser findByAccount(String username);
}
