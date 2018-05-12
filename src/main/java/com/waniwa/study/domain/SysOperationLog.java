package com.waniwa.study.domain;

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
 * 操作日志
 */
@Entity
@Table(name = "sys_operation_log")
@Data
public class SysOperationLog implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * 主键
   */
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Column(name = "id", insertable = false, nullable = false)
  private Long id;

  /**
   * 日志类型
   */
  @Column(name = "logtype")
  private String logtype;

  /**
   * 日志名称
   */
  @Column(name = "logname")
  private String logname;

  /**
   * 用户id
   */
  @Column(name = "userid")
  private Integer userid;

  /**
   * 类名称
   */
  @Column(name = "classname")
  private String classname;

  /**
   * 方法名称
   */
  @Column(name = "method")
  private String method;

  /**
   * 创建时间
   */
  @Column(name = "createtime")
  private Date createtime;

  /**
   * 是否成功
   */
  @Column(name = "succeed")
  private String succeed;

  /**
   * 备注
   */
  @Column(name = "message")
  private String message;

  
}