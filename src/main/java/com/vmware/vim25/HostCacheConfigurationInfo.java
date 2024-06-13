package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostCacheConfigurationInfo;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostCacheConfigurationInfo", propOrder = {"key", "swapSize"})
public class HostCacheConfigurationInfo extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference key;
  
  protected long swapSize;
  
  public ManagedObjectReference getKey() {
    return this.key;
  }
  
  public void setKey(ManagedObjectReference paramManagedObjectReference) {
    this.key = paramManagedObjectReference;
  }
  
  public long getSwapSize() {
    return this.swapSize;
  }
  
  public void setSwapSize(long paramLong) {
    this.swapSize = paramLong;
  }
}
