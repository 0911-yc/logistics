package com.xr.logistics.model;


import java.util.Date;

public class BasAssociateMember {

  private Integer id;
  private String zoneName;
  private String empNo;
  private String empName;
  private double standardKg;
  private double standardLength;
  private Date standardTime;
  private Integer subordinateUnit;
  private String type;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getZoneName() {
    return zoneName;
  }

  public void setZoneName(String zoneName) {
    this.zoneName = zoneName;
  }


  public String getEmpNo() {
    return empNo;
  }

  public void setEmpNo(String empNo) {
    this.empNo = empNo;
  }


  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }


  public double getStandardKg() {
    return standardKg;
  }

  public void setStandardKg(double standardKg) {
    this.standardKg = standardKg;
  }


  public double getStandardLength() {
    return standardLength;
  }

  public void setStandardLength(double standardLength) {
    this.standardLength = standardLength;
  }


  public Date getStandardTime() {
    return standardTime;
  }

  public void setStandardTime(Date standardTime) {
    this.standardTime = standardTime;
  }


  public Integer getSubordinateUnit() {
    return subordinateUnit;
  }

  public void setSubordinateUnit(Integer subordinateUnit) {
    this.subordinateUnit = subordinateUnit;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

}
