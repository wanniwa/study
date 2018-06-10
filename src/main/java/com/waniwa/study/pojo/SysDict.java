package com.waniwa.study.pojo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * 字典表
 */
@Entity
@Table(name = "sys_dict")
@Data
public class SysDict implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * 主键id
   */
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Column(name = "dict_id", insertable = false, nullable = false)
  private Long dictId;

  /**
   * 排序
   */
  @Column(name = "sort")
  private Integer sort;

  /**
   * 父级字典
   */
  @Column(name = "parent_id")
  private Integer parentId;

  /**
   * 名称
   */
  @Column(name = "name")
  private String name;

  /**
   * 提示
   */
  @Column(name = "tips")
  private String tips;

  
}