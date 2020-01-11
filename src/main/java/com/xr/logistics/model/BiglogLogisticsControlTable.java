package com.xr.logistics.model;



import java.io.Serializable;
import java.util.Date;

public class BiglogLogisticsControlTable implements Serializable {

  private static final long serialVersionUID = -2866982558599212230L;
  private Integer id;//编号
  private String workSheetNo;//工作单号
  private String cType;//类型
  private String corporation;//代理公司
  private String waybillId;//货票号
  private String remarks;//备注
  private Integer inputPerson;//录入人
  private Date inputDate;//录入时间
  private Integer inputCompany;//录入单位
  private String stats;//状态  0：正常，1：停用

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
