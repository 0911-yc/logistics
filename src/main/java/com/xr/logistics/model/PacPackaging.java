package com.xr.logistics.model;


import java.io.Serializable;
import java.util.Date;

public class PacPackaging implements Serializable {

  private static final long serialVersionUID = -8723593367585114974L;
  private Integer id;//编号
  private String itemCode;//物品编号
  private String itemName;//物品名称
  private double plannedPrice;//计划价格
  private String specifications;//规格
  private String type;//类型
  private String measurementUnit;//计量单位
  private boolean status;//状态
  private Integer operatorId;//操作人工号
  private Integer operationUnitId;//操作人姓名
  private Date operationTime;//操作时间
  private Integer invalidateJobInt;//作废人工号
  private Integer invalidateName;//作废人姓名
  private Date invalidateTime;//作废时间


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getItemCode() {
    return itemCode;
  }

  public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
  }


  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
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


  public String getMeasurementUnit() {
    return measurementUnit;
  }

  public void setMeasurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
  }


  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
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


  public Integer getInvalidateJobInt() {
    return invalidateJobInt;
  }

  public void setInvalidateJobInt(Integer invalidateJobInt) {
    this.invalidateJobInt = invalidateJobInt;
  }


  public Integer getInvalidateName() {
    return invalidateName;
  }

  public void setInvalidateName(Integer invalidateName) {
    this.invalidateName = invalidateName;
  }


  public Date getInvalidateTime() {
    return invalidateTime;
  }

  public void setInvalidateTime(Date invalidateTime) {
    this.invalidateTime = invalidateTime;
  }

}
