package com.waniwa.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.waniwa.study.domain.SysOperationLog;

public interface SysOperationLogRepository extends JpaRepository<SysOperationLog, Long> {

}