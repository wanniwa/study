package com.waniwa.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.waniwa.study.domain.SysDict;

public interface SysDictRepository extends JpaRepository<SysDict, Long> {

}