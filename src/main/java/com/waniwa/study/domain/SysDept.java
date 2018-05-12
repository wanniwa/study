package com.waniwa.study.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * 部门表
 */
@Data
@Entity
@Table(name = "sys_dept")
public class SysDept implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * 主键id
   */
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Column(insertable = false, name = "dept_id", nullable = false)
  private Long deptId;

  /**
   * 排序
   */
  @Column(name = "sort")
  private Integer sort;

  /**
   * 父部门id
   */
  @Column(name = "parent_id")
  private Integer parentId;

  /**
   * 父级ids
   */
  @Column(name = "pids")
  private String pids;

  /**
   * 简称
   */
  @Column(name = "simplename")
  private String simplename;

  /**
   * 全称
   */
  @Column(name = "fullname")
  private String fullname;

  /**
   * 提示
   */
  @Column(name = "tips")
  private String tips;

  /**
   * 版本（乐观锁保留字段）
   */
  @Column(name = "version")
  private Integer version;

  
}