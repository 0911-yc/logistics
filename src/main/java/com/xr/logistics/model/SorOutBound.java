package com.xr.logistics.model;


import java.util.Date;

public class SorOutBound {

  private String outBoundId;
  private String handoverType;
  private String line;
  private Integer direction;
  private Integer acceptPerson;
  private Integer carriers;
  private Integer deliveryPerson;
  private Date deliveryDate;
  private String deliveryCompany;
  private Integer enterPerson;
  private Date enterDate;


  public String getOutBoundId() {
    return outBoundId;
  }

  public void setOutBoundId(String outBoundId) {
    this.outBoundId = outBoundId;
  }


  public String getHandoverType() {
    return handoverType;
  }

  public void setHandoverType(String handoverType) {
    this.handoverType = handoverType;
  }


  public String getLine() {
    return line;
  }

  public void setLine(String line) {
    this.line = line;
  }


  public Integer getDirection() {
    return direction;
  }

  public void setDirection(Integer direction) {
    this.direction = direction;
  }


  public Integer getAcceptPerson() {
    return acceptPerson;
  }

  public void setAcceptPerson(Integer acceptPerson) {
    this.acceptPerson = acceptPerson;
  }


  public Integer getCarriers() {
    return carriers;
  }

  public void setCarriers(Integer carriers) {
    this.carriers = carriers;
  }


  public Integer getDeliveryPerson() {
    return deliveryPerson;
  }

  public void setDeliveryPerson(Integer deliveryPerson) {
    this.deliveryPerson = deliveryPerson;
  }


  public Date getDeliveryDate() {
    return deliveryDate;
  }

  public void setDeliveryDate(Date deliveryDate) {
    this.deliveryDate = deliveryDate;
  }


  public String getDeliveryCompany() {
    return deliveryCompany;
  }

  public void setDeliveryCompany(String deliveryCompany) {
    this.deliveryCompany = deliveryCompany;
  }


  public Integer getEnterPerson() {
    return enterPerson;
  }

  public void setEnterPerson(Integer enterPerson) {
    this.enterPerson = enterPerson;
  }


  public Date getEnterDate() {
    return enterDate;
  }

  public void setEnterDate(Date enterDate) {
    this.enterDate = enterDate;
  }

}
