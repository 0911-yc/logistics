package com.xr.logistics.model;


import java.io.Serializable;

public class PacOutboundType implements Serializable {

  private static final long serialVersionUID = -5036500528444800756L;
  private Integer id;//编号
  private String outBoundType;//出库类型


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getOutBoundType() {
    return outBoundType;
  }

  public void setOutBoundType(String outBoundType) {
    this.outBoundType = outBoundType;
  }

}
