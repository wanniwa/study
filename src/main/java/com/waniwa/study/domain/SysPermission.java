package com.waniwa.study.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author 王宁
 * @date 2018/5/12 16:46
 */
@Entity
@Data
public class SysPermission implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Column(columnDefinition="enum('menu','button')")
    private String resourceType;
    private String url;
    private Long parentId;
    private String parentIds;
    private Integer sort;
    private Integer level;
    private Integer isOpen;
    private String tips;

    @ManyToMany
    @JoinTable(name="SysRolePermission",joinColumns={@JoinColumn(name="permissionId")},inverseJoinColumns={@JoinColumn(name="roleId")})
    private List<SysRole> roleList;
}
