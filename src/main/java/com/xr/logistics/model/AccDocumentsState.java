package com.xr.logistics.model;



import java.io.Serializable;

public class AccDocumentsState implements Serializable {

  private static final long serialVersionUID = -6297856255617448330L;
  private Integer id;
  private String documentsState;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getDocumentsState() {
    return documentsState;
  }

  public void setDocumentsState(String documentsState) {
    this.documentsState = documentsState;
  }

}
