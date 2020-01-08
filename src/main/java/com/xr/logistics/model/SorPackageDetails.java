package com.xr.logistics.model;


import java.io.Serializable;
import java.util.Date;

public class SorPackageDetails implements Serializable {

  private static final long serialVersionUID = -6045384211854568055L;
  private Integer id;
  private Integer wareName;
  private String destination;
  private Integer ticket;
  private Integer actualCargoInt;
  private Integer cargoInt;
  private double weight;
  private double volume;
  private Date service;
  private String importantHints;
  private String ask;
  private String inputType;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getWareName() {
    return wareName;
  }

  public void setWareName(Integer wareName) {
    this.wareName = wareName;
  }


  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }


  public Integer getTicket() {
    return ticket;
  }

  public void setTicket(Integer ticket) {
    this.ticket = ticket;
  }


  public Integer getActualCargoInt() {
    return actualCargoInt;
  }

  public void setActualCargoInt(Integer actualCargoInt) {
    this.actualCargoInt = actualCargoInt;
  }


  public Integer getCargoInt() {
    return cargoInt;
  }

  public void setCargoInt(Integer cargoInt) {
    this.cargoInt = cargoInt;
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


  public Date getService() {
    return service;
  }

  public void setService(Date service) {
    this.service = service;
  }


  public String getImportantHints() {
    return importantHints;
  }

  public void setImportantHints(String importantHints) {
    this.importantHints = importantHints;
  }


  public String getAsk() {
    return ask;
  }

  public void setAsk(String ask) {
    this.ask = ask;
  }


  public String getInputType() {
    return inputType;
  }

  public void setInputType(String inputType) {
    this.inputType = inputType;
  }

}
