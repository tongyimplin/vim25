package com.vmware.vim25;

import com.vmware.vim25.HostMultipathInfoHppLogicalUnitPolicy;
import com.vmware.vim25.HostMultipathInfoLogicalUnitPolicy;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostMultipathInfoHppLogicalUnitPolicy", propOrder = {"bytes", "iops", "path", "latencyEvalTime", "samplingIosPerPath"})
public class HostMultipathInfoHppLogicalUnitPolicy extends HostMultipathInfoLogicalUnitPolicy {
  protected Long bytes;
  
  protected Long iops;
  
  protected String path;
  
  protected Long latencyEvalTime;
  
  protected Long samplingIosPerPath;
  
  public Long getBytes() {
    return this.bytes;
  }
  
  public void setBytes(Long paramLong) {
    this.bytes = paramLong;
  }
  
  public Long getIops() {
    return this.iops;
  }
  
  public void setIops(Long paramLong) {
    this.iops = paramLong;
  }
  
  public String getPath() {
    return this.path;
  }
  
  public void setPath(String paramString) {
    this.path = paramString;
  }
  
  public Long getLatencyEvalTime() {
    return this.latencyEvalTime;
  }
  
  public void setLatencyEvalTime(Long paramLong) {
    this.latencyEvalTime = paramLong;
  }
  
  public Long getSamplingIosPerPath() {
    return this.samplingIosPerPath;
  }
  
  public void setSamplingIosPerPath(Long paramLong) {
    this.samplingIosPerPath = paramLong;
  }
}
