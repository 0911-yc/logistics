package com.xr.logistics.model;


import java.io.Serializable;
import java.util.Date;

public class DisDispatchHistory implements Serializable {

  private static final long serialVersionUID = 1451535067576265104L;
  private Integer id;
  private Integer dispatchSequence;
  private Integer transferredUnit;
  private Integer operatorId;
  private Integer operationUnitId;
  private Date operationTime;
  private String remark;
  private String status;
  private String reason;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getDispatchSequence() {
    return dispatchSequence;
  }

  public void setDispatchSequence(Integer dispatchSequence) {
    this.dispatchSequence = dispatchSequence;
  }


  public Integer getTransferredUnit() {
    return transferredUnit;
  }

  public void setTransferredUnit(Integer transferredUnit) {
    this.transferredUnit = transferredUnit;
  }


  public Integer getOperatorId() {
    return operatorId;
  }

  public void setOperatorId(Integer operatorId) {
    this.operatorId = operatorId;
  }


  public Integer getOperationUnitId() {
    return operationUnitId;
  }

  public void setOperationUnitId(Integer operationUnitId) {
    this.operationUnitId = operationUnitId;
  }


  public Date getOperationTime() {
    return operationTime;
  }

  public void setOperationTime(Date operationTime) {
    this.operationTime = operationTime;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

}
