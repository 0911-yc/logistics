package com.xr.logistics.model;

import java.io.Serializable;
import java.util.Date;

public class SorStorage implements Serializable {

  private static final long serialVersionUID = -2872340149096694469L;
  private Integer id;
  private Date acceptDate;
  private Integer acceptPerson;
  private String acceptCompany;
  private Integer deliveryPerson;
  private String deliveryCompany;
  private String EmpName;
  private String SorName;

  public String getSorName() {
    return SorName;
  }

  public void setSorName(String sorName) {
    SorName = sorName;
  }

  public String getEmpName() {
    return EmpName;
  }

  public void setEmpName(String empName) {
    EmpName = empName;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Date getAcceptDate() {
    return acceptDate;
  }

  public void setAcceptDate(Date acceptDate) {
    this.acceptDate = acceptDate;
  }


  public Integer getAcceptPerson() {
    return acceptPerson;
  }

  public void setAcceptPerson(Integer acceptPerson) {
    this.acceptPerson = acceptPerson;
  }


  public String getAcceptCompany() {
    return acceptCompany;
  }

  public void setAcceptCompany(String acceptCompany) {
    this.acceptCompany = acceptCompany;
  }


  public Integer getDeliveryPerson() {
    return deliveryPerson;
  }

  public void setDeliveryPerson(Integer deliveryPerson) {
    this.deliveryPerson = deliveryPerson;
  }


  public String getDeliveryCompany() {
    return deliveryCompany;
  }

  public void setDeliveryCompany(String deliveryCompany) {
    this.deliveryCompany = deliveryCompany;
  }

}
