package com.xr.logistics.model;


import java.util.Date;

public class SorPackage {

  private Integer id;
  private Integer packagePerson;
  private String sealInt;
  private String destination;
  private String reckonDes;
  private Date timeLimit;
  private Integer ticketSum;
  private Integer cargoSum;
  private double weightSum;
  private double volumeSum;
  private String state;
  private String ask;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getPackagePerson() {
    return packagePerson;
  }

  public void setPackagePerson(Integer packagePerson) {
    this.packagePerson = packagePerson;
  }


  public String getSealInt() {
    return sealInt;
  }

  public void setSealInt(String sealInt) {
    this.sealInt = sealInt;
  }


  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }


  public String getReckonDes() {
    return reckonDes;
  }

  public void setReckonDes(String reckonDes) {
    this.reckonDes = reckonDes;
  }


  public Date getTimeLimit() {
    return timeLimit;
  }

  public void setTimeLimit(Date timeLimit) {
    this.timeLimit = timeLimit;
  }


  public Integer getTicketSum() {
    return ticketSum;
  }

  public void setTicketSum(Integer ticketSum) {
    this.ticketSum = ticketSum;
  }


  public Integer getCargoSum() {
    return cargoSum;
  }

  public void setCargoSum(Integer cargoSum) {
    this.cargoSum = cargoSum;
  }


  public double getWeightSum() {
    return weightSum;
  }

  public void setWeightSum(double weightSum) {
    this.weightSum = weightSum;
  }


  public double getVolumeSum() {
    return volumeSum;
  }

  public void setVolumeSum(double volumeSum) {
    this.volumeSum = volumeSum;
  }


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public String getAsk() {
    return ask;
  }

  public void setAsk(String ask) {
    this.ask = ask;
  }

}
