package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostVMotionManagerSrcInstantCloneResult;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVMotionManagerSrcInstantCloneResult", propOrder = {"startTime", "quiesceTime", "quiesceDoneTime", "resumeDoneTime", "endTime"})
public class HostVMotionManagerSrcInstantCloneResult extends DynamicData {
  protected Long startTime;
  
  protected Long quiesceTime;
  
  protected Long quiesceDoneTime;
  
  protected Long resumeDoneTime;
  
  protected Long endTime;
  
  public Long getStartTime() {
    return this.startTime;
  }
  
  public void setStartTime(Long paramLong) {
    this.startTime = paramLong;
  }
  
  public Long getQuiesceTime() {
    return this.quiesceTime;
  }
  
  public void setQuiesceTime(Long paramLong) {
    this.quiesceTime = paramLong;
  }
  
  public Long getQuiesceDoneTime() {
    return this.quiesceDoneTime;
  }
  
  public void setQuiesceDoneTime(Long paramLong) {
    this.quiesceDoneTime = paramLong;
  }
  
  public Long getResumeDoneTime() {
    return this.resumeDoneTime;
  }
  
  public void setResumeDoneTime(Long paramLong) {
    this.resumeDoneTime = paramLong;
  }
  
  public Long getEndTime() {
    return this.endTime;
  }
  
  public void setEndTime(Long paramLong) {
    this.endTime = paramLong;
  }
}
