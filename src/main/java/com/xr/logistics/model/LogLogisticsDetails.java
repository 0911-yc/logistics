package com.xr.logistics.model;


import java.util.Date;

public class LogLogisticsDetails {

  private Integer id;
  private String logisticsInt;
  private String companyName;
  private Date expectArrivalDate;
  private Date actualArrivalDate;
  private Date expectDepartureDate;
  private Date actualDepartureDate;
  private String operationPerson;
  private String logisticsType;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getLogisticsInt() {
    return logisticsInt;
  }

  public void setLogisticsInt(String logisticsInt) {
    this.logisticsInt = logisticsInt;
  }


  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public Date getExpectArrivalDate() {
    return expectArrivalDate;
  }

  public void setExpectArrivalDate(Date expectArrivalDate) {
    this.expectArrivalDate = expectArrivalDate;
  }


  public Date getActualArrivalDate() {
    return actualArrivalDate;
  }

  public void setActualArrivalDate(Date actualArrivalDate) {
    this.actualArrivalDate = actualArrivalDate;
  }


  public Date getExpectDepartureDate() {
    return expectDepartureDate;
  }

  public void setExpectDepartureDate(Date expectDepartureDate) {
    this.expectDepartureDate = expectDepartureDate;
  }


  public Date getActualDepartureDate() {
    return actualDepartureDate;
  }

  public void setActualDepartureDate(Date actualDepartureDate) {
    this.actualDepartureDate = actualDepartureDate;
  }


  public String getOperationPerson() {
    return operationPerson;
  }

  public void setOperationPerson(String operationPerson) {
    this.operationPerson = operationPerson;
  }


  public String getLogisticsType() {
    return logisticsType;
  }

  public void setLogisticsType(String logisticsType) {
    this.logisticsType = logisticsType;
  }

}
