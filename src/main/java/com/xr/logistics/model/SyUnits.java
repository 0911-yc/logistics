package com.xr.logistics.model;

import java.io.Serializable;
import java.util.Date;

public class SyUnits implements Serializable {

  private static final long serialVersionUID = 4076604696591350901L;
  private Integer id;
  private String name;
  private String remarks;
  private Integer operatorId;
  private Date operationTime;
  private String stats;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }


  public Integer getOperatorId() {
    return operatorId;
  }

  public void setOperatorId(Integer operatorId) {
    this.operatorId = operatorId;
  }


  public Date getOperationTime() {
    return operationTime;
  }

  public void setOperationTime(Date operationTime) {
    this.operationTime = operationTime;
  }


  public String getStats() {
    return stats;
  }

  public void setStats(String stats) {
    this.stats = stats;
  }

}
