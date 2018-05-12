package com.waniwa.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.waniwa.study.domain.SysExpense;

public interface SysExpenseRepository extends JpaRepository<SysExpense, Long> {

}