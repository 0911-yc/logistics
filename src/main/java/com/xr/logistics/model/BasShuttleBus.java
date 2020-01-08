package com.xr.logistics.model;


import java.util.Date;

public class BasShuttleBus {

  private Integer id;
  private String lineType;
  private Integer lineId;
  private String licensePlateInt;
  private String carrier;
  private String models;
  private String driver;
  private String telephone;
  private Integer ton;
  private String remarks;
  private Integer operationUnitId;
  private Integer operatorId;
  private Date operationTime;
  private String stats;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getLineType() {
    return lineType;
  }

  public void setLineType(String lineType) {
    this.lineType = lineType;
  }


  public Integer getLineId() {
    return lineId;
  }

  public void setLineId(Integer lineId) {
    this.lineId = lineId;
  }


  public String getLicensePlateInt() {
    return licensePlateInt;
  }

  public void setLicensePlateInt(String licensePlateInt) {
    this.licensePlateInt = licensePlateInt;
  }


  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }


  public String getModels() {
    return models;
  }

  public void setModels(String models) {
    this.models = models;
  }


  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }


  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }


  public Integer getTon() {
    return ton;
  }

  public void setTon(Integer ton) {
    this.ton = ton;
  }


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }


  public Integer getOperationUnitId() {
    return operationUnitId;
  }

  public void setOperationUnitId(Integer operationUnitId) {
    this.operationUnitId = operationUnitId;
  }


  public Integer getOperatorId() {
    return operatorId;
  }

  public void setOperatorId(Integer operatorId) {
    this.operatorId = operatorId;
  }


  public Date getOperationTime() {
    return operationTime;
  }

  public void setOperationTime(Date operationTime) {
    this.operationTime = operationTime;
  }


  public String getStats() {
    return stats;
  }

  public void setStats(String stats) {
    this.stats = stats;
  }

}
