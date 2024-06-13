package com.vmware.vim25;

import com.vmware.vim25.InsufficientNetworkResourcePoolCapacity;
import com.vmware.vim25.InsufficientResourcesFault;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsufficientNetworkResourcePoolCapacity", propOrder = {"dvsName", "dvsUuid", "resourcePoolKey", "available", "requested", "device"})
public class InsufficientNetworkResourcePoolCapacity extends InsufficientResourcesFault {
  @XmlElement(required = true)
  protected String dvsName;
  
  @XmlElement(required = true)
  protected String dvsUuid;
  
  @XmlElement(required = true)
  protected String resourcePoolKey;
  
  protected long available;
  
  protected long requested;
  
  @XmlElement(required = true)
  protected List<String> device;
  
  public String getDvsName() {
    return this.dvsName;
  }
  
  public void setDvsName(String paramString) {
    this.dvsName = paramString;
  }
  
  public String getDvsUuid() {
    return this.dvsUuid;
  }
  
  public void setDvsUuid(String paramString) {
    this.dvsUuid = paramString;
  }
  
  public String getResourcePoolKey() {
    return this.resourcePoolKey;
  }
  
  public void setResourcePoolKey(String paramString) {
    this.resourcePoolKey = paramString;
  }
  
  public long getAvailable() {
    return this.available;
  }
  
  public void setAvailable(long paramLong) {
    this.available = paramLong;
  }
  
  public long getRequested() {
    return this.requested;
  }
  
  public void setRequested(long paramLong) {
    this.requested = paramLong;
  }
  
  public List<String> getDevice() {
    if (this.device == null)
      this.device = new ArrayList<>(); 
    return this.device;
  }
}
