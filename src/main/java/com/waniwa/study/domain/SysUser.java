package com.waniwa.study.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Administrator
 */
@Entity
@Data
public class SysUser implements Serializable {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue
    private Integer id;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 账号
     */
    @Column(unique = true)
    private String account;

    /**
     * 密码
     */
    private String password;

    /**
     * md5密码盐
     */
    private String salt;

    /**
     * 名字
     */
    private String name;

    /**
     * 电子邮件
     */
    private String email;

    /**
     * 电话
     */
    private String phone;

    /**
     * 角色id
     */
    private String roleId;

    /**
     * 部门id
     */
    private Integer deptId;

    /**
     * 状态(1：启用  2：冻结  3：删除）
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 保留字段
     */
    private Integer version;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "SysUserRole" ,joinColumns = {@JoinColumn(name = "userId")},inverseJoinColumns = {@JoinColumn(name = "roleId" )})
    private List<SysRole> roleList;
}