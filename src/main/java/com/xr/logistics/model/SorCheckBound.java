package com.xr.logistics.model;



import java.io.Serializable;
import java.util.Date;

public class SorCheckBound implements Serializable {

  private static final long serialVersionUID = 4367103912265192088L;
  private Integer id;
  private Integer scanId;
  private Integer cargoSum;
  private Integer checkPerson;
  private Date checkDate;
  private String checkCompany;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getScanId() {
    return scanId;
  }

  public void setScanId(Integer scanId) {
    this.scanId = scanId;
  }


  public Integer getCargoSum() {
    return cargoSum;
  }

  public void setCargoSum(Integer cargoSum) {
    this.cargoSum = cargoSum;
  }


  public Integer getCheckPerson() {
    return checkPerson;
  }

  public void setCheckPerson(Integer checkPerson) {
    this.checkPerson = checkPerson;
  }


  public Date getCheckDate() {
    return checkDate;
  }

  public void setCheckDate(Date checkDate) {
    this.checkDate = checkDate;
  }


  public String getCheckCompany() {
    return checkCompany;
  }

  public void setCheckCompany(String checkCompany) {
    this.checkCompany = checkCompany;
  }

}
