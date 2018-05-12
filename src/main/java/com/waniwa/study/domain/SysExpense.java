package com.waniwa.study.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * 报销表
 */
@Entity
@Table(name = "sys_expense")
@Data
public class SysExpense implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Column(name = "id", insertable = false, nullable = false)
  private Long id;

  /**
   * 报销金额
   */
  @Column(name = "money")
  private BigDecimal money;

  /**
   * 描述
   */
  @Column(name = "desc")
  private String desc = "";

  @Column(name = "create_time")
  private Date createTime = new Date();

  /**
   * 状态: 1.待提交  2:待审核   3.审核通过 4:驳回
   */
  @Column(name = "state")
  private Integer state;

  /**
   * 用户id
   */
  @Column(name = "user_id")
  private Integer userId;

  /**
   * 流程定义id
   */
  @Column(name = "processId")
  private String processId;

  
}