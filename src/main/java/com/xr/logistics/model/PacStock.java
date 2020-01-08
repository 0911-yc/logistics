package com.xr.logistics.model;



import java.io.Serializable;
import java.util.Date;

public class PacStock implements Serializable {

  private static final long serialVersionUID = 2959776972649317339L;
  private String warehouseNo;//入库单号
  private String reservoirType;//入库类型
  private String transport;//运输单号
  private String subordinateUnit;//所属单位
  private Integer drawerNo;//开单人工号
  private String drawerName;//开单人姓名
  private Date drawerTime;//开单时间
  private Integer produceTypeId;//
  private String stats;//状态  0：正常，1：停用
  private String remark;//备注

  public String getWarehouseNo() {
    return warehouseNo;
  }

  public void setWarehouseNo(String warehouseNo) {
    this.warehouseNo = warehouseNo;
  }


  public String getReservoirType() {
    return reservoirType;
  }

  public void setReservoirType(String reservoirType) {
    this.reservoirType = reservoirType;
  }


  public String getTransport() {
    return transport;
  }

  public void setTransport(String transport) {
    this.transport = transport;
  }


  public String getSubordinateUnit() {
    return subordinateUnit;
  }

  public void setSubordinateUnit(String subordinateUnit) {
    this.subordinateUnit = subordinateUnit;
  }


  public Integer getDrawerNo() {
    return drawerNo;
  }

  public void setDrawerNo(Integer drawerNo) {
    this.drawerNo = drawerNo;
  }


  public String getDrawerName() {
    return drawerName;
  }

  public void setDrawerName(String drawerName) {
    this.drawerName = drawerName;
  }


  public Date getDrawerTime() {
    return drawerTime;
  }

  public void setDrawerTime(Date drawerTime) {
    this.drawerTime = drawerTime;
  }


  public Integer getProduceTypeId() {
    return produceTypeId;
  }

  public void setProduceTypeId(Integer produceTypeId) {
    this.produceTypeId = produceTypeId;
  }


  public String getStats() {
    return stats;
  }

  public void setStats(String stats) {
    this.stats = stats;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

}
