package com.waniwa.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.waniwa.study.domain.SysDept;

public interface SysDeptRepository extends JpaRepository<SysDept, Long> {

}