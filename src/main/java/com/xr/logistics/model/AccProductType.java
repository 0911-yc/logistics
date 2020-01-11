package com.xr.logistics.model;



import java.io.Serializable;

public class AccProductType implements Serializable {

  private static final long serialVersionUID = -3144249711764100051L;
  private Integer id;
  private String produceType;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getProduceType() {
    return produceType;
  }

  public void setProduceType(String produceType) {
    this.produceType = produceType;
  }

}
