package com.xr.logistics.model;



import java.io.Serializable;
import java.util.Set;

public class SyRoles implements Serializable {

  private static final long serialVersionUID = 6176889634672671876L;
  private Integer id;
  private String roleName;
  private String roleDesc;
  private String disabled;

// 当前角色的权限
  private Set<SyMenus> menus;
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }


  public String getRoleDesc() {
    return roleDesc;
  }

  public void setRoleDesc(String roleDesc) {
    this.roleDesc = roleDesc;
  }


  public String getDisabled() {
    return disabled;
  }

  public void setDisabled(String disabled) {
    this.disabled = disabled;
  }

  public SyRoles(Integer id, String roleName, String roleDesc, String disabled) {
    this.id = id;
    this.roleName = roleName;
    this.roleDesc = roleDesc;
    this.disabled = disabled;
  }
}
