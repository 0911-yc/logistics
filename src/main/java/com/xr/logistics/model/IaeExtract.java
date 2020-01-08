package com.xr.logistics.model;



import java.io.Serializable;
import java.util.Date;

public class IaeExtract implements Serializable {

  private static final long serialVersionUID = -8904088582522555302L;
  private String id;
  private String vehicleInt;
  private String transportWay;
  private String waybillId;
  private Date estimateDate;
  private Integer cargoN;
  private String importantHints;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getVehicleInt() {
    return vehicleInt;
  }

  public void setVehicleInt(String vehicleInt) {
    this.vehicleInt = vehicleInt;
  }


  public String getTransportWay() {
    return transportWay;
  }

  public void setTransportWay(String transportWay) {
    this.transportWay = transportWay;
  }


  public String getWaybillId() {
    return waybillId;
  }

  public void setWaybillId(String waybillId) {
    this.waybillId = waybillId;
  }


  public Date getEstimateDate() {
    return estimateDate;
  }

  public void setEstimateDate(Date estimateDate) {
    this.estimateDate = estimateDate;
  }


  public Integer getCargoN() {
    return cargoN;
  }

  public void setCargoN(Integer cargoN) {
    this.cargoN = cargoN;
  }


  public String getImportantHints() {
    return importantHints;
  }

  public void setImportantHints(String importantHints) {
    this.importantHints = importantHints;
  }

}
