package com.xr.logistics.model;



import java.io.Serializable;
import java.util.Date;

public class RetReturnList implements Serializable {

  private static final long serialVersionUID = -7600192231371317250L;
  private Integer id;
  private String applicationNo;
  private String workSheetNo;
  private String returnType;
  private String apRemark;
  private Integer apLoss;
  private Date entryTime;
  private Integer receivegUnit;
  private String invalidateSign;
  private Integer returnUnit;
  private Date recordingTime;
  private Integer entryUnit;
  private String personName;
  private Date confirmationTime;
  private Integer confirmationUnit;
  private String confirmationPersonName;
  private String treatmentState;
  private String apReturnStatus;
  private String identificationSign;
  private String handlingOpinions;
  private String denialType;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getApplicationNo() {
    return applicationNo;
  }

  public void setApplicationNo(String applicationNo) {
    this.applicationNo = applicationNo;
  }


  public String getWorkSheetNo() {
    return workSheetNo;
  }

  public void setWorkSheetNo(String workSheetNo) {
    this.workSheetNo = workSheetNo;
  }


  public String getReturnType() {
    return returnType;
  }

  public void setReturnType(String returnType) {
    this.returnType = returnType;
  }


  public String getApRemark() {
    return apRemark;
  }

  public void setApRemark(String apRemark) {
    this.apRemark = apRemark;
  }


  public Integer getApLoss() {
    return apLoss;
  }

  public void setApLoss(Integer apLoss) {
    this.apLoss = apLoss;
  }


  public Date getEntryTime() {
    return entryTime;
  }

  public void setEntryTime(Date entryTime) {
    this.entryTime = entryTime;
  }


  public Integer getReceivegUnit() {
    return receivegUnit;
  }

  public void setReceivegUnit(Integer receivegUnit) {
    this.receivegUnit = receivegUnit;
  }


  public String getInvalidateSign() {
    return invalidateSign;
  }

  public void setInvalidateSign(String invalidateSign) {
    this.invalidateSign = invalidateSign;
  }


  public Integer getReturnUnit() {
    return returnUnit;
  }

  public void setReturnUnit(Integer returnUnit) {
    this.returnUnit = returnUnit;
  }


  public Date getRecordingTime() {
    return recordingTime;
  }

  public void setRecordingTime(Date recordingTime) {
    this.recordingTime = recordingTime;
  }


  public Integer getEntryUnit() {
    return entryUnit;
  }

  public void setEntryUnit(Integer entryUnit) {
    this.entryUnit = entryUnit;
  }


  public String getPersonName() {
    return personName;
  }

  public void setPersonName(String personName) {
    this.personName = personName;
  }


  public Date getConfirmationTime() {
    return confirmationTime;
  }

  public void setConfirmationTime(Date confirmationTime) {
    this.confirmationTime = confirmationTime;
  }


  public Integer getConfirmationUnit() {
    return confirmationUnit;
  }

  public void setConfirmationUnit(Integer confirmationUnit) {
    this.confirmationUnit = confirmationUnit;
  }


  public String getConfirmationPersonName() {
    return confirmationPersonName;
  }

  public void setConfirmationPersonName(String confirmationPersonName) {
    this.confirmationPersonName = confirmationPersonName;
  }


  public String getTreatmentState() {
    return treatmentState;
  }

  public void setTreatmentState(String treatmentState) {
    this.treatmentState = treatmentState;
  }


  public String getApReturnStatus() {
    return apReturnStatus;
  }

  public void setApReturnStatus(String apReturnStatus) {
    this.apReturnStatus = apReturnStatus;
  }


  public String getIdentificationSign() {
    return identificationSign;
  }

  public void setIdentificationSign(String identificationSign) {
    this.identificationSign = identificationSign;
  }


  public String getHandlingOpinions() {
    return handlingOpinions;
  }

  public void setHandlingOpinions(String handlingOpinions) {
    this.handlingOpinions = handlingOpinions;
  }


  public String getDenialType() {
    return denialType;
  }

  public void setDenialType(String denialType) {
    this.denialType = denialType;
  }

}
