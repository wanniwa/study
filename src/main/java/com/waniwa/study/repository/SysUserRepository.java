package com.waniwa.study.repository;

import com.waniwa.study.pojo.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysUserRepository extends JpaRepository<SysUser, Long> {
    SysUser findByAccount(String account);
}