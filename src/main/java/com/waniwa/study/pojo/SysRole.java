package com.waniwa.study.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author 王宁
 * @date 2018/5/12 16:24
 */
@Entity
@Data
public class SysRole implements Serializable {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue
    private Long id ;

    private Integer num;

    private Long pid;

    private String name;

    private Long deptId;

    private String tips;

    private Integer version;

    private Integer status;

    @ManyToMany
    @JoinTable(name = "SysUserRole" ,joinColumns = {@JoinColumn(name = "roleId")},inverseJoinColumns = {@JoinColumn(name = "userId" )})
    private List<SysUser> userList;

    /**
     *    角色 -- 权限关系：多对多关系;
     */
    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name="SysRolePermission",joinColumns={@JoinColumn(name="roleId")},inverseJoinColumns={@JoinColumn(name="permissionId")})
    private List<SysPermission> permissionList;


}
