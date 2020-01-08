package com.xr.logistics.model;


import java.util.Date;

public class AccWorkOrder {

  private Integer id;
  private String jobNo;
  private String jobType;
  private String pickupStatus;
  private Integer shortMessageInt;
  private Date workGenerationTime;
  private Integer afterSingleNum;
  private Integer smallMemberNum;
  private Integer pickupUnit;
  private String businessNoticeNo;
  private Date pickupTime;
  private String sortingCode;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getJobNo() {
    return jobNo;
  }

  public void setJobNo(String jobNo) {
    this.jobNo = jobNo;
  }


  public String getJobType() {
    return jobType;
  }

  public void setJobType(String jobType) {
    this.jobType = jobType;
  }


  public String getPickupStatus() {
    return pickupStatus;
  }

  public void setPickupStatus(String pickupStatus) {
    this.pickupStatus = pickupStatus;
  }


  public Integer getShortMessageInt() {
    return shortMessageInt;
  }

  public void setShortMessageInt(Integer shortMessageInt) {
    this.shortMessageInt = shortMessageInt;
  }


  public Date getWorkGenerationTime() {
    return workGenerationTime;
  }

  public void setWorkGenerationTime(Date workGenerationTime) {
    this.workGenerationTime = workGenerationTime;
  }


  public Integer getAfterSingleNum() {
    return afterSingleNum;
  }

  public void setAfterSingleNum(Integer afterSingleNum) {
    this.afterSingleNum = afterSingleNum;
  }


  public Integer getSmallMemberNum() {
    return smallMemberNum;
  }

  public void setSmallMemberNum(Integer smallMemberNum) {
    this.smallMemberNum = smallMemberNum;
  }


  public Integer getPickupUnit() {
    return pickupUnit;
  }

  public void setPickupUnit(Integer pickupUnit) {
    this.pickupUnit = pickupUnit;
  }


  public String getBusinessNoticeNo() {
    return businessNoticeNo;
  }

  public void setBusinessNoticeNo(String businessNoticeNo) {
    this.businessNoticeNo = businessNoticeNo;
  }


  public Date getPickupTime() {
    return pickupTime;
  }

  public void setPickupTime(Date pickupTime) {
    this.pickupTime = pickupTime;
  }


  public String getSortingCode() {
    return sortingCode;
  }

  public void setSortingCode(String sortingCode) {
    this.sortingCode = sortingCode;
  }

}
