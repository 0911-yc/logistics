package com.xr.logistics.model;


import java.io.Serializable;

public class BasZoneCustomInfo implements Serializable {

  private static final long serialVersionUID = 5959349485194038307L;
  private Integer customCode;
  private String customName;
  private Integer mobileNo;
  private String cityName;
  private String cstomAddress;
  private String zoneName;


  public Integer getCustomCode() {
    return customCode;
  }

  public void setCustomCode(Integer customCode) {
    this.customCode = customCode;
  }


  public String getCustomName() {
    return customName;
  }

  public void setCustomName(String customName) {
    this.customName = customName;
  }


  public Integer getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(Integer mobileNo) {
    this.mobileNo = mobileNo;
  }


  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }


  public String getCstomAddress() {
    return cstomAddress;
  }

  public void setCstomAddress(String cstomAddress) {
    this.cstomAddress = cstomAddress;
  }


  public String getZoneName() {
    return zoneName;
  }

  public void setZoneName(String zoneName) {
    this.zoneName = zoneName;
  }

}
