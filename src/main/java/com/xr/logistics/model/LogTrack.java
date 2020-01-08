package com.xr.logistics.model;


import java.util.Date;

public class LogTrack {

  private Integer id;
  private String lineType;
  private String lineName;
  private String logisticsCar;
  private String lineState;
  private String nodeName;
  private Date startTime;
  private Date arrivalTime;
  private String carInt;
  private String nextNodeLoad;
  private String describes;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getLineType() {
    return lineType;
  }

  public void setLineType(String lineType) {
    this.lineType = lineType;
  }


  public String getLineName() {
    return lineName;
  }

  public void setLineName(String lineName) {
    this.lineName = lineName;
  }


  public String getLogisticsCar() {
    return logisticsCar;
  }

  public void setLogisticsCar(String logisticsCar) {
    this.logisticsCar = logisticsCar;
  }


  public String getLineState() {
    return lineState;
  }

  public void setLineState(String lineState) {
    this.lineState = lineState;
  }


  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }


  public Date getStartTime() {
    return startTime;
  }

  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }


  public Date getArrivalTime() {
    return arrivalTime;
  }

  public void setArrivalTime(Date arrivalTime) {
    this.arrivalTime = arrivalTime;
  }


  public String getCarInt() {
    return carInt;
  }

  public void setCarInt(String carInt) {
    this.carInt = carInt;
  }


  public String getNextNodeLoad() {
    return nextNodeLoad;
  }

  public void setNextNodeLoad(String nextNodeLoad) {
    this.nextNodeLoad = nextNodeLoad;
  }


  public String getDescribes() {
    return describes;
  }

  public void setDescribes(String describes) {
    this.describes = describes;
  }

}
