package com.xr.logistics.model;


import java.io.Serializable;
import java.util.Date;

public class BasStandarTime implements Serializable {

  private static final long serialVersionUID = 5397124660315024811L;
  private Integer id;
  private String timeName;
  private Integer subordinateUnit;
  private Date workingTime;
  private Date closingTime;
  private Date saturdayWorkingTime;
  private Date saturdayClosingTime;
  private Date sundayWorkingTime;
  private Date sundayClosingTime;
  private String stats;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getTimeName() {
    return timeName;
  }

  public void setTimeName(String timeName) {
    this.timeName = timeName;
  }


  public Integer getSubordinateUnit() {
    return subordinateUnit;
  }

  public void setSubordinateUnit(Integer subordinateUnit) {
    this.subordinateUnit = subordinateUnit;
  }


  public Date getWorkingTime() {
    return workingTime;
  }

  public void setWorkingTime(Date workingTime) {
    this.workingTime = workingTime;
  }


  public Date getClosingTime() {
    return closingTime;
  }

  public void setClosingTime(Date closingTime) {
    this.closingTime = closingTime;
  }


  public Date getSaturdayWorkingTime() {
    return saturdayWorkingTime;
  }

  public void setSaturdayWorkingTime(Date saturdayWorkingTime) {
    this.saturdayWorkingTime = saturdayWorkingTime;
  }


  public Date getSaturdayClosingTime() {
    return saturdayClosingTime;
  }

  public void setSaturdayClosingTime(Date saturdayClosingTime) {
    this.saturdayClosingTime = saturdayClosingTime;
  }


  public Date getSundayWorkingTime() {
    return sundayWorkingTime;
  }

  public void setSundayWorkingTime(Date sundayWorkingTime) {
    this.sundayWorkingTime = sundayWorkingTime;
  }


  public Date getSundayClosingTime() {
    return sundayClosingTime;
  }

  public void setSundayClosingTime(Date sundayClosingTime) {
    this.sundayClosingTime = sundayClosingTime;
  }


  public String getStats() {
    return stats;
  }

  public void setStats(String stats) {
    this.stats = stats;
  }

}
