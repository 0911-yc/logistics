package com.xr.logistics.model;


import java.io.Serializable;
import java.util.Date;

public class LogLogisticsTransfer implements Serializable {

  private static final long serialVersionUID = 9197650394913884613L;
  private Integer id;
  private String transferInt;
  private String startStation;
  private String endStation;
  private String dispatcher;
  private String driver;
  private Integer deliveryPerson;
  private Date deliveryDate;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getTransferInt() {
    return transferInt;
  }

  public void setTransferInt(String transferInt) {
    this.transferInt = transferInt;
  }


  public String getStartStation() {
    return startStation;
  }

  public void setStartStation(String startStation) {
    this.startStation = startStation;
  }


  public String getEndStation() {
    return endStation;
  }

  public void setEndStation(String endStation) {
    this.endStation = endStation;
  }


  public String getDispatcher() {
    return dispatcher;
  }

  public void setDispatcher(String dispatcher) {
    this.dispatcher = dispatcher;
  }


  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
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

}
