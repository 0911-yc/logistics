package com.xr.logistics.model;


import java.io.Serializable;
import java.util.Date;

public class IaeArrival implements Serializable {

  private static final long serialVersionUID = 3755545682260986490L;
  private String id;
  private String sendCompany;
  private String cargoAddress;
  private String issuePerson;
  private Date issueDate;
  private String workAddress;
  private Date storageDate;
  private Date outBoundDate;
  private Date timeLimit;
  private Date batch;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getSendCompany() {
    return sendCompany;
  }

  public void setSendCompany(String sendCompany) {
    this.sendCompany = sendCompany;
  }


  public String getCargoAddress() {
    return cargoAddress;
  }

  public void setCargoAddress(String cargoAddress) {
    this.cargoAddress = cargoAddress;
  }


  public String getIssuePerson() {
    return issuePerson;
  }

  public void setIssuePerson(String issuePerson) {
    this.issuePerson = issuePerson;
  }


  public Date getIssueDate() {
    return issueDate;
  }

  public void setIssueDate(Date issueDate) {
    this.issueDate = issueDate;
  }


  public String getWorkAddress() {
    return workAddress;
  }

  public void setWorkAddress(String workAddress) {
    this.workAddress = workAddress;
  }


  public Date getStorageDate() {
    return storageDate;
  }

  public void setStorageDate(Date storageDate) {
    this.storageDate = storageDate;
  }


  public Date getOutBoundDate() {
    return outBoundDate;
  }

  public void setOutBoundDate(Date outBoundDate) {
    this.outBoundDate = outBoundDate;
  }


  public Date getTimeLimit() {
    return timeLimit;
  }

  public void setTimeLimit(Date timeLimit) {
    this.timeLimit = timeLimit;
  }


  public Date getBatch() {
    return batch;
  }

  public void setBatch(Date batch) {
    this.batch = batch;
  }

}
