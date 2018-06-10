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
 * 登录记录
 */
@Entity
@Table(name = "sys_login_log")
@Data
public class SysLoginLog implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * 主键
   */
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Column(name = "id", insertable = false, nullable = false)
  private Long id;

  /**
   * 日志名称
   */
  @Column(name = "logname")
  private String logname;

  /**
   * 管理员id
   */
  @Column(name = "user_id")
  private Integer userId;

  /**
   * 创建时间
   */
  @Column(name = "create_time")
  private Date createTime;

  /**
   * 是否执行成功
   */
  @Column(name = "succeed")
  private String succeed;

  /**
   * 具体消息
   */
  @Column(name = "message")
  private String message;

  /**
   * 登录ip
   */
  @Column(name = "ip")
  private String ip;

  
}