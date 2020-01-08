package com.xr.logistics.model;


import java.io.Serializable;
import java.util.Date;

public class SorAbnormal implements Serializable {

  private static final long serialVersionUID = 8565513178633285973L;
  private Integer id;
  private Date launchDate;
  private String launchPerson;
  private String launchCompany;
  private String abnormalType;
  private String transferInt;
  private String cargoInt;
  private String packageInt;
  private Integer hedgeAbnInt;
  private String aboState;
  private Date handleDate;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Date getLaunchDate() {
    return launchDate;
  }

  public void setLaunchDate(Date launchDate) {
    this.launchDate = launchDate;
  }


  public String getLaunchPerson() {
    return launchPerson;
  }

  public void setLaunchPerson(String launchPerson) {
    this.launchPerson = launchPerson;
  }


  public String getLaunchCompany() {
    return launchCompany;
  }

  public void setLaunchCompany(String launchCompany) {
    this.launchCompany = launchCompany;
  }


  public String getAbnormalType() {
    return abnormalType;
  }

  public void setAbnormalType(String abnormalType) {
    this.abnormalType = abnormalType;
  }


  public String getTransferInt() {
    return transferInt;
  }

  public void setTransferInt(String transferInt) {
    this.transferInt = transferInt;
  }


  public String getCargoInt() {
    return cargoInt;
  }

  public void setCargoInt(String cargoInt) {
    this.cargoInt = cargoInt;
  }


  public String getPackageInt() {
    return packageInt;
  }

  public void setPackageInt(String packageInt) {
    this.packageInt = packageInt;
  }


  public Integer getHedgeAbnInt() {
    return hedgeAbnInt;
  }

  public void setHedgeAbnInt(Integer hedgeAbnInt) {
    this.hedgeAbnInt = hedgeAbnInt;
  }


  public String getAboState() {
    return aboState;
  }

  public void setAboState(String aboState) {
    this.aboState = aboState;
  }


  public Date getHandleDate() {
    return handleDate;
  }

  public void setHandleDate(Date handleDate) {
    this.handleDate = handleDate;
  }

}
