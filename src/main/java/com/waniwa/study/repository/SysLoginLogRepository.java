package com.waniwa.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.waniwa.study.pojo.SysLoginLog;

public interface SysLoginLogRepository extends JpaRepository<SysLoginLog, Long> {

}