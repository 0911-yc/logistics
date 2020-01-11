package com.xr.logistics.model;


import java.io.Serializable;
import java.util.Date;

public class PacStock implements Serializable {

  private static final long serialVersionUID = -4955869520646468711L;
  private String warehouseNo;
  private String reservoirType;
  private String transport;
  private String subordinateUnit;
  private Integer drawerNo;
  private String drawerName;
  private Date drawerTime;
  private Integer produceTypeId;
  private boolean stats;
  private String remark;


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

  public boolean isStats() {
    return stats;
  }

  public void setStats(boolean stats) {
    this.stats = stats;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

}
