package com.xr.logistics.model;



import java.io.Serializable;
import java.util.Date;

public class IaeLineResource implements Serializable {

  private static final long serialVersionUID = -2198910857112178219L;
  private String id;
  private String resourceType;
  private String port;
  private String demand;
  private String vehicleInt;
  private String capacity;
  private String waybillId;
  private String carrier;
  private Date expectArrivalDate;
  private Date expectDepartureDate;
  private Integer ticket;
  private Integer cargo;
  private double weight;
  private double volume;
  private String handlePerson;
  private Date handleDate;
  private Integer enterPerson;
  private Date enterDate;
  private String enterCompany;
  private Integer acceptPerson;
  private Date acceptDate;
  private String acceptCompany;
  private String abnormalRemarks;
  private String workInt;
  private String transfer;
  private Integer actualCount;
  private String destination;
  private String wareName;
  private double actualVolume;
  private Date timeLimit;
  private String ask;
  private String takeCargoPerson;
  private String tackCargoAddress;
  private Integer payment;
  private String specialEnsure;
  private String deliveryType;
  private String importantHints;
  private Date surplusTime;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
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


  public String getCapacity() {
    return capacity;
  }

  public void setCapacity(String capacity) {
    this.capacity = capacity;
  }


  public String getWaybillId() {
    return waybillId;
  }

  public void setWaybillId(String waybillId) {
    this.waybillId = waybillId;
  }


  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
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


  public Integer getTicket() {
    return ticket;
  }

  public void setTicket(Integer ticket) {
    this.ticket = ticket;
  }


  public Integer getCargo() {
    return cargo;
  }

  public void setCargo(Integer cargo) {
    this.cargo = cargo;
  }


  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }


  public double getVolume() {
    return volume;
  }

  public void setVolume(double volume) {
    this.volume = volume;
  }


  public String getHandlePerson() {
    return handlePerson;
  }

  public void setHandlePerson(String handlePerson) {
    this.handlePerson = handlePerson;
  }


  public Date getHandleDate() {
    return handleDate;
  }

  public void setHandleDate(Date handleDate) {
    this.handleDate = handleDate;
  }


  public Integer getEnterPerson() {
    return enterPerson;
  }

  public void setEnterPerson(Integer enterPerson) {
    this.enterPerson = enterPerson;
  }


  public Date getEnterDate() {
    return enterDate;
  }

  public void setEnterDate(Date enterDate) {
    this.enterDate = enterDate;
  }


  public String getEnterCompany() {
    return enterCompany;
  }

  public void setEnterCompany(String enterCompany) {
    this.enterCompany = enterCompany;
  }


  public Integer getAcceptPerson() {
    return acceptPerson;
  }

  public void setAcceptPerson(Integer acceptPerson) {
    this.acceptPerson = acceptPerson;
  }


  public Date getAcceptDate() {
    return acceptDate;
  }

  public void setAcceptDate(Date acceptDate) {
    this.acceptDate = acceptDate;
  }


  public String getAcceptCompany() {
    return acceptCompany;
  }

  public void setAcceptCompany(String acceptCompany) {
    this.acceptCompany = acceptCompany;
  }


  public String getAbnormalRemarks() {
    return abnormalRemarks;
  }

  public void setAbnormalRemarks(String abnormalRemarks) {
    this.abnormalRemarks = abnormalRemarks;
  }


  public String getWorkInt() {
    return workInt;
  }

  public void setWorkInt(String workInt) {
    this.workInt = workInt;
  }


  public String getTransfer() {
    return transfer;
  }

  public void setTransfer(String transfer) {
    this.transfer = transfer;
  }


  public Integer getActualCount() {
    return actualCount;
  }

  public void setActualCount(Integer actualCount) {
    this.actualCount = actualCount;
  }


  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }


  public String getWareName() {
    return wareName;
  }

  public void setWareName(String wareName) {
    this.wareName = wareName;
  }


  public double getActualVolume() {
    return actualVolume;
  }

  public void setActualVolume(double actualVolume) {
    this.actualVolume = actualVolume;
  }


  public Date getTimeLimit() {
    return timeLimit;
  }

  public void setTimeLimit(Date timeLimit) {
    this.timeLimit = timeLimit;
  }


  public String getAsk() {
    return ask;
  }

  public void setAsk(String ask) {
    this.ask = ask;
  }


  public String getTakeCargoPerson() {
    return takeCargoPerson;
  }

  public void setTakeCargoPerson(String takeCargoPerson) {
    this.takeCargoPerson = takeCargoPerson;
  }


  public String getTackCargoAddress() {
    return tackCargoAddress;
  }

  public void setTackCargoAddress(String tackCargoAddress) {
    this.tackCargoAddress = tackCargoAddress;
  }


  public Integer getPayment() {
    return payment;
  }

  public void setPayment(Integer payment) {
    this.payment = payment;
  }


  public String getSpecialEnsure() {
    return specialEnsure;
  }

  public void setSpecialEnsure(String specialEnsure) {
    this.specialEnsure = specialEnsure;
  }


  public String getDeliveryType() {
    return deliveryType;
  }

  public void setDeliveryType(String deliveryType) {
    this.deliveryType = deliveryType;
  }


  public String getImportantHints() {
    return importantHints;
  }

  public void setImportantHints(String importantHints) {
    this.importantHints = importantHints;
  }


  public Date getSurplusTime() {
    return surplusTime;
  }

  public void setSurplusTime(Date surplusTime) {
    this.surplusTime = surplusTime;
  }

}
