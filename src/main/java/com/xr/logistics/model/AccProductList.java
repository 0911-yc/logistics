package com.xr.logistics.model;


import java.io.Serializable;

public class AccProductList implements Serializable {

  private static final long serialVersionUID = -6066868472453354039L;
  private Integer id;
  private String produceName;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getProduceName() {
    return produceName;
  }

  public void setProduceName(String produceName) {
    this.produceName = produceName;
  }

}
