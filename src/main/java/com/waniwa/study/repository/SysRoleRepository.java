package com.waniwa.study.repository;

import com.waniwa.study.domain.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysRoleRepository extends JpaRepository<SysUser, Long> {

}