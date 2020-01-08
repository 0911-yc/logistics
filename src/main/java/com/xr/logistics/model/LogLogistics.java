package com.xr.logistics.model;


import java.io.Serializable;

public class LogLogistics implements Serializable {

  private static final long serialVersionUID = -5665809290658756825L;
  private Integer id;
  private String logisticsInt;
  private String lineName;
  private String startCompany;
  private String generatePerson;
  private String carInt;
  private String driver;
  private String driverPhone;
  private String carType;
  private String logisticsState;
  private String isCancel;


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


  public String getLineName() {
    return lineName;
  }

  public void setLineName(String lineName) {
    this.lineName = lineName;
  }


  public String getStartCompany() {
    return startCompany;
  }

  public void setStartCompany(String startCompany) {
    this.startCompany = startCompany;
  }


  public String getGeneratePerson() {
    return generatePerson;
  }

  public void setGeneratePerson(String generatePerson) {
    this.generatePerson = generatePerson;
  }


  public String getCarInt() {
    return carInt;
  }

  public void setCarInt(String carInt) {
    this.carInt = carInt;
  }


  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }


  public String getDriverPhone() {
    return driverPhone;
  }

  public void setDriverPhone(String driverPhone) {
    this.driverPhone = driverPhone;
  }


  public String getCarType() {
    return carType;
  }

  public void setCarType(String carType) {
    this.carType = carType;
  }


  public String getLogisticsState() {
    return logisticsState;
  }

  public void setLogisticsState(String logisticsState) {
    this.logisticsState = logisticsState;
  }


  public String getIsCancel() {
    return isCancel;
  }

  public void setIsCancel(String isCancel) {
    this.isCancel = isCancel;
  }

}
