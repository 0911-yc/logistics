package com.xr.logistics.model;

import java.io.Serializable;

public class PacStockItem implements Serializable {

  private static final long serialVersionUID = 8182414267422376266L;
  private Integer id;//编号
  private String warehouseNo;//入库单号
  private String goodsCode;//货物编码
  private String goodsName;//货物名称
  private Integer storageNum;//入库数量
  private Integer actualNum;//实际数量
  private double plannedPrice;//计划价格
  private String specifications;//规格
  private String type;//类型
  private String status;//状态  0.正常、1.作废

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


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

}
