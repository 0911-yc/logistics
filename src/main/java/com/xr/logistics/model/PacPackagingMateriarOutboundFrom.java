package com.xr.logistics.model;


import java.io.Serializable;
import java.util.Date;

public class PacPackagingMateriarOutboundFrom implements Serializable {

  private static final long serialVersionUID = 5394902672625355749L;
  private Integer id;//编号
  private String outboundNumber;
  private Integer outboundType;
  private String transportSlip;
  private Integer affiliatedUnit;
  private Integer issuedByTheUnit;
  private Integer operator;
  private Integer clienter;
  private Integer recipient;
  private Date recipientsTime;
  private Integer single;
  private Date orderTime;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getOutboundNumber() {
    return outboundNumber;
  }

  public void setOutboundNumber(String outboundNumber) {
    this.outboundNumber = outboundNumber;
  }


  public Integer getOutboundType() {
    return outboundType;
  }

  public void setOutboundType(Integer outboundType) {
    this.outboundType = outboundType;
  }


  public String getTransportSlip() {
    return transportSlip;
  }

  public void setTransportSlip(String transportSlip) {
    this.transportSlip = transportSlip;
  }


  public Integer getAffiliatedUnit() {
    return affiliatedUnit;
  }

  public void setAffiliatedUnit(Integer affiliatedUnit) {
    this.affiliatedUnit = affiliatedUnit;
  }


  public Integer getIssuedByTheUnit() {
    return issuedByTheUnit;
  }

  public void setIssuedByTheUnit(Integer issuedByTheUnit) {
    this.issuedByTheUnit = issuedByTheUnit;
  }


  public Integer getOperator() {
    return operator;
  }

  public void setOperator(Integer operator) {
    this.operator = operator;
  }


  public Integer getClienter() {
    return clienter;
  }

  public void setClienter(Integer clienter) {
    this.clienter = clienter;
  }


  public Integer getRecipient() {
    return recipient;
  }

  public void setRecipient(Integer recipient) {
    this.recipient = recipient;
  }


  public Date getRecipientsTime() {
    return recipientsTime;
  }

  public void setRecipientsTime(Date recipientsTime) {
    this.recipientsTime = recipientsTime;
  }


  public Integer getSingle() {
    return single;
  }

  public void setSingle(Integer single) {
    this.single = single;
  }


  public Date getOrderTime() {
    return orderTime;
  }

  public void setOrderTime(Date orderTime) {
    this.orderTime = orderTime;
  }

}
