package com.xr.logistics.model;


import java.util.Date;

public class BiglogLogisticsControlTable {

  private Integer id;
  private String workSheetNo;
  private String cType;
  private String corporation;
  private String waybillId;
  private String remarks;
  private Integer inputPerson;
  private Date inputDate;
  private Integer inputCompany;
  private String stats;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getWorkSheetNo() {
    return workSheetNo;
  }

  public void setWorkSheetNo(String workSheetNo) {
    this.workSheetNo = workSheetNo;
  }


  public String getCType() {
    return cType;
  }

  public void setCType(String cType) {
    this.cType = cType;
  }


  public String getCorporation() {
    return corporation;
  }

  public void setCorporation(String corporation) {
    this.corporation = corporation;
  }


  public String getWaybillId() {
    return waybillId;
  }

  public void setWaybillId(String waybillId) {
    this.waybillId = waybillId;
  }


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }


  public Integer getInputPerson() {
    return inputPerson;
  }

  public void setInputPerson(Integer inputPerson) {
    this.inputPerson = inputPerson;
  }


  public Date getInputDate() {
    return inputDate;
  }

  public void setInputDate(Date inputDate) {
    this.inputDate = inputDate;
  }


  public Integer getInputCompany() {
    return inputCompany;
  }

  public void setInputCompany(Integer inputCompany) {
    this.inputCompany = inputCompany;
  }


  public String getStats() {
    return stats;
  }

  public void setStats(String stats) {
    this.stats = stats;
  }

}
