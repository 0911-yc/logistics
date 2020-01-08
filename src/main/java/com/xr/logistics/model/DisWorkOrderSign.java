package com.xr.logistics.model;



import java.io.Serializable;
import java.util.Date;

public class DisWorkOrderSign implements Serializable {

  private static final long serialVersionUID = 7077507680143764312L;
  private Integer id;
  private Integer workOrderId;
  private String workSheetNo;
  private String workOrderType;
  private String signType;
  private Integer courierInt;
  private String courierName;
  private String recipient;
  private Integer signUnit;
  private Date signTime;
  private String invalidateMark;
  private String abnormalMark;
  private Integer inputPersonCode;
  private Integer inputPersonId;
  private Integer inputId;
  private Date inputTime;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getWorkOrderId() {
    return workOrderId;
  }

  public void setWorkOrderId(Integer workOrderId) {
    this.workOrderId = workOrderId;
  }


  public String getWorkSheetNo() {
    return workSheetNo;
  }

  public void setWorkSheetNo(String workSheetNo) {
    this.workSheetNo = workSheetNo;
  }


  public String getWorkOrderType() {
    return workOrderType;
  }

  public void setWorkOrderType(String workOrderType) {
    this.workOrderType = workOrderType;
  }


  public String getSignType() {
    return signType;
  }

  public void setSignType(String signType) {
    this.signType = signType;
  }


  public Integer getCourierInt() {
    return courierInt;
  }

  public void setCourierInt(Integer courierInt) {
    this.courierInt = courierInt;
  }


  public String getCourierName() {
    return courierName;
  }

  public void setCourierName(String courierName) {
    this.courierName = courierName;
  }


  public String getRecipient() {
    return recipient;
  }

  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }


  public Integer getSignUnit() {
    return signUnit;
  }

  public void setSignUnit(Integer signUnit) {
    this.signUnit = signUnit;
  }


  public Date getSignTime() {
    return signTime;
  }

  public void setSignTime(Date signTime) {
    this.signTime = signTime;
  }


  public String getInvalidateMark() {
    return invalidateMark;
  }

  public void setInvalidateMark(String invalidateMark) {
    this.invalidateMark = invalidateMark;
  }


  public String getAbnormalMark() {
    return abnormalMark;
  }

  public void setAbnormalMark(String abnormalMark) {
    this.abnormalMark = abnormalMark;
  }


  public Integer getInputPersonCode() {
    return inputPersonCode;
  }

  public void setInputPersonCode(Integer inputPersonCode) {
    this.inputPersonCode = inputPersonCode;
  }


  public Integer getInputPersonId() {
    return inputPersonId;
  }

  public void setInputPersonId(Integer inputPersonId) {
    this.inputPersonId = inputPersonId;
  }


  public Integer getInputId() {
    return inputId;
  }

  public void setInputId(Integer inputId) {
    this.inputId = inputId;
  }


  public Date getInputTime() {
    return inputTime;
  }

  public void setInputTime(Date inputTime) {
    this.inputTime = inputTime;
  }

}
