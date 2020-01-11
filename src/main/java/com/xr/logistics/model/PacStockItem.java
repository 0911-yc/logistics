package com.xr.logistics.model;


import java.io.Serializable;

public class PacStockItem implements Serializable{

  private static final long serialVersionUID = -9117371806535375319L;
  private Integer id;
  private String warehouseNo;
  private String goodsCode;
  private String goodsName;
  private Integer storageNum;
  private Integer actualNum;
  private double plannedPrice;
  private String specifications;
  private String type;
  private boolean status;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getWarehouseNo() {
    return warehouseNo;
  }

  public void setWarehouseNo(String warehouseNo) {
    this.warehouseNo = warehouseNo;
  }


  public String getGoodsCode() {
    return goodsCode;
  }

  public void setGoodsCode(String goodsCode) {
    this.goodsCode = goodsCode;
  }


  public String getGoodsName() {
    return goodsName;
  }

  public void setGoodsName(String goodsName) {
    this.goodsName = goodsName;
  }


  public Integer getStorageNum() {
    return storageNum;
  }

  public void setStorageNum(Integer storageNum) {
    this.storageNum = storageNum;
  }


  public Integer getActualNum() {
    return actualNum;
  }

  public void setActualNum(Integer actualNum) {
    this.actualNum = actualNum;
  }


  public double getPlannedPrice() {
    return plannedPrice;
  }

  public void setPlannedPrice(double plannedPrice) {
    this.plannedPrice = plannedPrice;
  }


  public String getSpecifications() {
    return specifications;
  }

  public void setSpecifications(String specifications) {
    this.specifications = specifications;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }
}
