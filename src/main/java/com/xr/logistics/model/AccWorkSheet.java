package com.xr.logistics.model;


import java.io.Serializable;
import java.util.Date;

public class AccWorkSheet implements Serializable {

  private static final long serialVersionUID = 4043646701558715712L;
  private Integer id;
  private String workSheetNo;
  private String destination;
  private String productTime;
  private Integer total;
  private double weight;
  private String stowageRequirements;
  private Integer productTypeId;
  private Integer subordinateUnit;
  private Date subordinateDate;
  private Integer documentsStateId;
  private Integer dataStateId;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getWorkSheetNo() {
    return workSheetNo;
  }

  public void setWorkSheetNo(String workSheetNo) {
    this.workSheetNo = workSheetNo;
  }


  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }


  public String getProductTime() {
    return productTime;
  }

  public void setProductTime(String productTime) {
    this.productTime = productTime;
  }


  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }


  public String getStowageRequirements() {
    return stowageRequirements;
  }

  public void setStowageRequirements(String stowageRequirements) {
    this.stowageRequirements = stowageRequirements;
  }


  public Integer getProductTypeId() {
    return productTypeId;
  }

  public void setProductTypeId(Integer productTypeId) {
    this.productTypeId = productTypeId;
  }


  public Integer getSubordinateUnit() {
    return subordinateUnit;
  }

  public void setSubordinateUnit(Integer subordinateUnit) {
    this.subordinateUnit = subordinateUnit;
  }


  public Date getSubordinateDate() {
    return subordinateDate;
  }

  public void setSubordinateDate(Date subordinateDate) {
    this.subordinateDate = subordinateDate;
  }


  public Integer getDocumentsStateId() {
    return documentsStateId;
  }

  public void setDocumentsStateId(Integer documentsStateId) {
    this.documentsStateId = documentsStateId;
  }


  public Integer getDataStateId() {
    return dataStateId;
  }

  public void setDataStateId(Integer dataStateId) {
    this.dataStateId = dataStateId;
  }

}
