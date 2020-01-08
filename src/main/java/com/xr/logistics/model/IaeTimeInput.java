package com.xr.logistics.model;


import java.io.Serializable;
import java.util.Date;

public class IaeTimeInput implements Serializable {

  private static final long serialVersionUID = -5290179239047212998L;
  private Integer id;
  private String inputType;
  private String port;
  private String demand;
  private String vehicleInt;
  private String waybillId;
  private Date expectArrivalDate;
  private Date expectDepartureDate;
  private Date actualArrivalDate;
  private Date actualDepartureDate;
  private String start;
  private Integer carriers;
  private String remarks;
  private Integer inputPerson;
  private Date inputDate;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getInputType() {
    return inputType;
  }

  public void setInputType(String inputType) {
    this.inputType = inputType;
  }


  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }


  public String getDemand() {
    return demand;
  }

  public void setDemand(String demand) {
    this.demand = demand;
  }


  public String getVehicleInt() {
    return vehicleInt;
  }

  public void setVehicleInt(String vehicleInt) {
    this.vehicleInt = vehicleInt;
  }


  public String getWaybillId() {
    return waybillId;
  }

  public void setWaybillId(String waybillId) {
    this.waybillId = waybillId;
  }


  public Date getExpectArrivalDate() {
    return expectArrivalDate;
  }

  public void setExpectArrivalDate(Date expectArrivalDate) {
    this.expectArrivalDate = expectArrivalDate;
  }


  public Date getExpectDepartureDate() {
    return expectDepartureDate;
  }

  public void setExpectDepartureDate(Date expectDepartureDate) {
    this.expectDepartureDate = expectDepartureDate;
  }


  public Date getActualArrivalDate() {
    return actualArrivalDate;
  }

  public void setActualArrivalDate(Date actualArrivalDate) {
    this.actualArrivalDate = actualArrivalDate;
  }


  public Date getActualDepartureDate() {
    return actualDepartureDate;
  }

  public void setActualDepartureDate(Date actualDepartureDate) {
    this.actualDepartureDate = actualDepartureDate;
  }


  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }


  public Integer getCarriers() {
    return carriers;
  }

  public void setCarriers(Integer carriers) {
    this.carriers = carriers;
  }


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }


  public Integer getInputPerson() {
    return inputPerson;
  }

  public void setInputPerson(Integer inputPerson) {
    this.inputPerson = inputPerson;
  }


  public Date getInputDate() {
    return inputDate;
  }

  public void setInputDate(Date inputDate) {
    this.inputDate = inputDate;
  }

}
