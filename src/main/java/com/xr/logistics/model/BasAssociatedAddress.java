package com.xr.logistics.model;


public class BasAssociatedAddress {

  private Integer id;
  private String zoneName;
  private String city;
  private String customAddress;
  private Integer associatedPartitions;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getZoneName() {
    return zoneName;
  }

  public void setZoneName(String zoneName) {
    this.zoneName = zoneName;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public String getCustomAddress() {
    return customAddress;
  }

  public void setCustomAddress(String customAddress) {
    this.customAddress = customAddress;
  }


  public Integer getAssociatedPartitions() {
    return associatedPartitions;
  }

  public void setAssociatedPartitions(Integer associatedPartitions) {
    this.associatedPartitions = associatedPartitions;
  }

}
