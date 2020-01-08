package com.xr.logistics.model;


public class SorStorageDetails {

  private Integer id;
  private String packageId;
  private double weight;
  private String outBoundId;
  private String state;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getPackageId() {
    return packageId;
  }

  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }


  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }


  public String getOutBoundId() {
    return outBoundId;
  }

  public void setOutBoundId(String outBoundId) {
    this.outBoundId = outBoundId;
  }


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

}
