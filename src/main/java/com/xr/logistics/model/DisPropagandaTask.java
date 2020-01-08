package com.xr.logistics.model;


import java.util.Date;

public class DisPropagandaTask {

  private Integer id;
  private String outline;
  private Date releaseTime;
  private Date failureTime;
  private String status;
  private String content;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getOutline() {
    return outline;
  }

  public void setOutline(String outline) {
    this.outline = outline;
  }


  public Date getReleaseTime() {
    return releaseTime;
  }

  public void setReleaseTime(Date releaseTime) {
    this.releaseTime = releaseTime;
  }


  public Date getFailureTime() {
    return failureTime;
  }

  public void setFailureTime(Date failureTime) {
    this.failureTime = failureTime;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

}
