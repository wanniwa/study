package com.waniwa.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Administrator
 */
@SpringBootApplication
@EntityScan(basePackages = {"com.waniwa.study.domain" })
@EnableJpaRepositories(basePackages = {"com.waniwa.study.repository"})
public class StudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyApplication.class, args);
    }
}
