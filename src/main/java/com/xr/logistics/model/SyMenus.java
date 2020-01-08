package com.xr.logistics.model;


import java.io.Serializable;

public class SyMenus implements Serializable {

  private static final long serialVersionUID = 475395341432128193L;
  private Integer id;
  private String parentId;
  private String type;
  private String text;
  private String url;
  private String tip;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public String getTip() {
    return tip;
  }

  public void setTip(String tip) {
    this.tip = tip;
  }

}
