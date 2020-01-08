package com.xr.logistics.model;


import java.io.Serializable;

public class BasZoneInfo implements Serializable {

  private static final long serialVersionUID = -3820671430862300947L;
  private String zoneName;
  private String zoneCode;
  private Integer zonePeople;
  private String telPhone;
  private Integer subordinateUnit;
  private String stats;


  public String getZoneName() {
    return zoneName;
  }

  public void setZoneName(String zoneName) {
    this.zoneName = zoneName;
  }


  public String getZoneCode() {
    return zoneCode;
  }

  public void setZoneCode(String zoneCode) {
    this.zoneCode = zoneCode;
  }


  public Integer getZonePeople() {
    return zonePeople;
  }

  public void setZonePeople(Integer zonePeople) {
    this.zonePeople = zonePeople;
  }


  public String getTelPhone() {
    return telPhone;
  }

  public void setTelPhone(String telPhone) {
    this.telPhone = telPhone;
  }


  public Integer getSubordinateUnit() {
    return subordinateUnit;
  }

  public void setSubordinateUnit(Integer subordinateUnit) {
    this.subordinateUnit = subordinateUnit;
  }


  public String getStats() {
    return stats;
  }

  public void setStats(String stats) {
    this.stats = stats;
  }

}
