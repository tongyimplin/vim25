package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.QueryMemoryOverheadRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryMemoryOverheadRequestType", propOrder = {"_this", "memorySize", "videoRamSize", "numVcpus"})
public class QueryMemoryOverheadRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected long memorySize;
  
  protected Integer videoRamSize;
  
  protected int numVcpus;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public long getMemorySize() {
    return this.memorySize;
  }
  
  public void setMemorySize(long paramLong) {
    this.memorySize = paramLong;
  }
  
  public Integer getVideoRamSize() {
    return this.videoRamSize;
  }
  
  public void setVideoRamSize(Integer paramInteger) {
    this.videoRamSize = paramInteger;
  }
  
  public int getNumVcpus() {
    return this.numVcpus;
  }
  
  public void setNumVcpus(int paramInt) {
    this.numVcpus = paramInt;
  }
}
