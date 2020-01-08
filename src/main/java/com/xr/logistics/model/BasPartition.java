package com.xr.logistics.model;



import java.io.Serializable;

public class BasPartition implements Serializable {

  private static final long serialVersionUID = -6303171782215951112L;
  private Integer id;
  private String province;
  private String city;
  private String county;
  private String zoneCode;
  private String keyword;
  private Integer startInt;
  private Integer terminateInt;
  private String sdInt;
  private String stats;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }


  public String getZoneCode() {
    return zoneCode;
  }

  public void setZoneCode(String zoneCode) {
    this.zoneCode = zoneCode;
  }


  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public Integer getStartInt() {
    return startInt;
  }

  public void setStartInt(Integer startInt) {
    this.startInt = startInt;
  }


  public Integer getTerminateInt() {
    return terminateInt;
  }

  public void setTerminateInt(Integer terminateInt) {
    this.terminateInt = terminateInt;
  }


  public String getSdInt() {
    return sdInt;
  }

  public void setSdInt(String sdInt) {
    this.sdInt = sdInt;
  }


  public String getStats() {
    return stats;
  }

  public void setStats(String stats) {
    this.stats = stats;
  }

}
