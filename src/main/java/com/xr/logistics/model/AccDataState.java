package com.xr.logistics.model;


import java.io.Serializable;

public class AccDataState implements Serializable {

  private static final long serialVersionUID = 1713971148991853128L;
  private Integer id;
  private String dataState;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getDataState() {
    return dataState;
  }

  public void setDataState(String dataState) {
    this.dataState = dataState;
  }

}
