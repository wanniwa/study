package com.waniwa.study.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * 通知表
 */
@Data
@Entity
@Table(name = "sys_notice")
public class SysNotice implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * 主键
   */
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Column(name = "id", insertable = false, nullable = false)
  private Long id;

  /**
   * 标题
   */
  @Column(name = "title")
  private String title;

  /**
   * 类型
   */
  @Column(name = "type")
  private Integer type;

  /**
   * 内容
   */
  @Column(name = "content")
  private String content;

  /**
   * 创建时间
   */
  @Column(name = "createtime")
  private Date createtime;

  /**
   * 创建人
   */
  @Column(name = "creater")
  private Integer creater;

  
}