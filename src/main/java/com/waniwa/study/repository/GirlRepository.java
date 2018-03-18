package com.waniwa.study.repository;

import com.waniwa.study.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author wanniwa
 * @date 2018/3/17 23:51
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {

    List<Girl>  findByAge(Integer age);
}
