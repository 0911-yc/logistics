package com.xr.logistics.model;


import java.util.Date;

public class BasDeliveryStandard {

  private String basicFileNumber;
  private String name;
  private double minWeight;
  private double maxWeight;
  private Integer operatorId;
  private Integer operationUnitId;
  private Date operationTime;
  private String stats;


  public String getBasicFileNumber() {
    return basicFileNumber;
  }

  public void setBasicFileNumber(String basicFileNumber) {
    this.basicFileNumber = basicFileNumber;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public double getMinWeight() {
    return minWeight;
  }

  public void setMinWeight(double minWeight) {
    this.minWeight = minWeight;
  }


  public double getMaxWeight() {
    return maxWeight;
  }

  public void setMaxWeight(double maxWeight) {
    this.maxWeight = maxWeight;
  }


  public Integer getOperatorId() {
    return operatorId;
  }

  public void setOperatorId(Integer operatorId) {
    this.operatorId = operatorId;
  }


  public Integer getOperationUnitId() {
    return operationUnitId;
  }

  public void setOperationUnitId(Integer operationUnitId) {
    this.operationUnitId = operationUnitId;
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
