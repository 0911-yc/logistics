package com.xr.logistics.model;



import java.io.Serializable;
import java.util.Date;

public class SorOutBoundDetails implements Serializable {

  private static final long serialVersionUID = 1196372908002878905L;
  private Integer id;
  private String packageId;
  private double weight;
  private double volume;
  private Date scanDate;
  private String isScan;
  private String isNextStorage;
  private String isDoubleStorage;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getPackageId() {
    return packageId;
  }

  public void setPackageId(String packageId) {
    this.packageId = packageId;
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


  public Date getScanDate() {
    return scanDate;
  }

  public void setScanDate(Date scanDate) {
    this.scanDate = scanDate;
  }


  public String getIsScan() {
    return isScan;
  }

  public void setIsScan(String isScan) {
    this.isScan = isScan;
  }


  public String getIsNextStorage() {
    return isNextStorage;
  }

  public void setIsNextStorage(String isNextStorage) {
    this.isNextStorage = isNextStorage;
  }


  public String getIsDoubleStorage() {
    return isDoubleStorage;
  }

  public void setIsDoubleStorage(String isDoubleStorage) {
    this.isDoubleStorage = isDoubleStorage;
  }

}
