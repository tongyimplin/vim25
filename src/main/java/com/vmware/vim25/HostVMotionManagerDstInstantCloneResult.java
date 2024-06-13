package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostVMotionManagerDstInstantCloneResult;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVMotionManagerDstInstantCloneResult", propOrder = {"dstVmId", "startTime", "cptLoadTime", "cptLoadDoneTime", "replicateMemDoneTime", "endTime", "cptXferTime", "cptCacheUsed", "devCptStreamSize", "devCptStreamTime"})
public class HostVMotionManagerDstInstantCloneResult extends DynamicData {
  protected Integer dstVmId;
  
  protected Long startTime;
  
  protected Long cptLoadTime;
  
  protected Long cptLoadDoneTime;
  
  protected Long replicateMemDoneTime;
  
  protected Long endTime;
  
  protected Long cptXferTime;
  
  protected Long cptCacheUsed;
  
  protected Long devCptStreamSize;
  
  protected Long devCptStreamTime;
  
  public Integer getDstVmId() {
    return this.dstVmId;
  }
  
  public void setDstVmId(Integer paramInteger) {
    this.dstVmId = paramInteger;
  }
  
  public Long getStartTime() {
    return this.startTime;
  }
  
  public void setStartTime(Long paramLong) {
    this.startTime = paramLong;
  }
  
  public Long getCptLoadTime() {
    return this.cptLoadTime;
  }
  
  public void setCptLoadTime(Long paramLong) {
    this.cptLoadTime = paramLong;
  }
  
  public Long getCptLoadDoneTime() {
    return this.cptLoadDoneTime;
  }
  
  public void setCptLoadDoneTime(Long paramLong) {
    this.cptLoadDoneTime = paramLong;
  }
  
  public Long getReplicateMemDoneTime() {
    return this.replicateMemDoneTime;
  }
  
  public void setReplicateMemDoneTime(Long paramLong) {
    this.replicateMemDoneTime = paramLong;
  }
  
  public Long getEndTime() {
    return this.endTime;
  }
  
  public void setEndTime(Long paramLong) {
    this.endTime = paramLong;
  }
  
  public Long getCptXferTime() {
    return this.cptXferTime;
  }
  
  public void setCptXferTime(Long paramLong) {
    this.cptXferTime = paramLong;
  }
  
  public Long getCptCacheUsed() {
    return this.cptCacheUsed;
  }
  
  public void setCptCacheUsed(Long paramLong) {
    this.cptCacheUsed = paramLong;
  }
  
  public Long getDevCptStreamSize() {
    return this.devCptStreamSize;
  }
  
  public void setDevCptStreamSize(Long paramLong) {
    this.devCptStreamSize = paramLong;
  }
  
  public Long getDevCptStreamTime() {
    return this.devCptStreamTime;
  }
  
  public void setDevCptStreamTime(Long paramLong) {
    this.devCptStreamTime = paramLong;
  }
}
