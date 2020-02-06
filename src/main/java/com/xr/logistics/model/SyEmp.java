package com.xr.logistics.model;

import java.io.Serializable;
import java.util.Set;

public class SyEmp implements Serializable {

  private static final long serialVersionUID = -8873558970747658765L;
  private Integer id;
  private String empName;
  private String empNo;
  private String pwd;
  private String queryPwd;
  private Integer roleId;
  private Integer empUnit;
  private String remark;
  private int disabled;
  private String account;

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  //  一对多权限
  private Set<SyRoles> roles;
  private Set<SyMenus> menus;

  public Set<SyRoles> getRoles() {
    return roles;
  }

  public void setRoles(Set<SyRoles> roles) {
    this.roles = roles;
  }

  public Set<SyMenus> getMenus() {
    return menus;
  }

  public void setMenus(Set<SyMenus> menus) {
    this.menus = menus;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }


  public String getEmpNo() {
    return empNo;
  }

  public void setEmpNo(String empNo) {
    this.empNo = empNo;
  }


  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }


  public String getQueryPwd() {
    return queryPwd;
  }

  public void setQueryPwd(String queryPwd) {
    this.queryPwd = queryPwd;
  }


  public Integer getRoleId() {
    return roleId;
  }

  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }


  public Integer getEmpUnit() {
    return empUnit;
  }

  public void setEmpUnit(Integer empUnit) {
    this.empUnit = empUnit;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public int getDisabled() {
    return disabled;
  }

  public void setDisabled(int disabled) {
    this.disabled = disabled;
  }

    public SyEmp(Integer id, String empName, String empNo, String pwd, String queryPwd, Integer roleId, Integer empUnit, String remark, int disabled, String account, Set<SyRoles> roles, Set<SyMenus> menus) {
        this.id = id;
        this.empName = empName;
        this.empNo = empNo;
        this.pwd = pwd;
        this.queryPwd = queryPwd;
        this.roleId = roleId;
        this.empUnit = empUnit;
        this.remark = remark;
        this.disabled = disabled;
        this.account = account;
        this.roles = roles;
        this.menus = menus;
    }


}
