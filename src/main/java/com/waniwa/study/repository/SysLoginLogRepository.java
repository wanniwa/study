package com.waniwa.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.waniwa.study.domain.SysLoginLog;

public interface SysLoginLogRepository extends JpaRepository<SysLoginLog, Long> {

}