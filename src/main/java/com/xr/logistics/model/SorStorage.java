package com.xr.logistics.model;


import java.util.Date;

public class SorStorage {

  private Integer id;
  private Date acceptDate;
  private Integer acceptPerson;
  private String acceptCompany;
  private Integer deliveryPerson;
  private String deliveryCompany;


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
