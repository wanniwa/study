package com.waniwa.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.waniwa.study.domain.SysNotice;

public interface SysNoticeRepository extends JpaRepository<SysNotice, Long> {

}