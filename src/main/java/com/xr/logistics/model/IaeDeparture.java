package com.xr.logistics.model;


import java.util.Date;

public class IaeDeparture {

  private String id;
  private String packingId;
  private String transfer;
  private Integer actualCount;
  private String destination;
  private Integer wareName;
  private Integer cargoCount;
  private double weight;
  private double volume;
  private double actualVolume;
  private Date timeLimit;
  private String ask;
  private String takeCargoPerson;
  private String tackCargoAddress;
  private Integer payment;
  private String importantHints;
  private Date surplusTime;
  private String entrustCompany;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getPackingId() {
    return packingId;
  }

  public void setPackingId(String packingId) {
    this.packingId = packingId;
  }


  public String getTransfer() {
    return transfer;
  }

  public void setTransfer(String transfer) {
    this.transfer = transfer;
  }


  public Integer getActualCount() {
    return actualCount;
  }

  public void setActualCount(Integer actualCount) {
    this.actualCount = actualCount;
  }


  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }


  public Integer getWareName() {
    return wareName;
  }

  public void setWareName(Integer wareName) {
    this.wareName = wareName;
  }


  public Integer getCargoCount() {
    return cargoCount;
  }

  public void setCargoCount(Integer cargoCount) {
    this.cargoCount = cargoCount;
  }


  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }


  public double getVolume() {
    return volume;
  }

  public void setVolume(double volume) {
    this.volume = volume;
  }


  public double getActualVolume() {
    return actualVolume;
  }

  public void setActualVolume(double actualVolume) {
    this.actualVolume = actualVolume;
  }


  public Date getTimeLimit() {
    return timeLimit;
  }

  public void setTimeLimit(Date timeLimit) {
    this.timeLimit = timeLimit;
  }


  public String getAsk() {
    return ask;
  }

  public void setAsk(String ask) {
    this.ask = ask;
  }


  public String getTakeCargoPerson() {
    return takeCargoPerson;
  }

  public void setTakeCargoPerson(String takeCargoPerson) {
    this.takeCargoPerson = takeCargoPerson;
  }


  public String getTackCargoAddress() {
    return tackCargoAddress;
  }

  public void setTackCargoAddress(String tackCargoAddress) {
    this.tackCargoAddress = tackCargoAddress;
  }


  public Integer getPayment() {
    return payment;
  }

  public void setPayment(Integer payment) {
    this.payment = payment;
  }


  public String getImportantHints() {
    return importantHints;
  }

  public void setImportantHints(String importantHints) {
    this.importantHints = importantHints;
  }


  public Date getSurplusTime() {
    return surplusTime;
  }

  public void setSurplusTime(Date surplusTime) {
    this.surplusTime = surplusTime;
  }


  public String getEntrustCompany() {
    return entrustCompany;
  }

  public void setEntrustCompany(String entrustCompany) {
    this.entrustCompany = entrustCompany;
  }

}
