package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostCacheConfigurationSpec;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostCacheConfigurationSpec", propOrder = {"datastore", "swapSize"})
public class HostCacheConfigurationSpec extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference datastore;
  
  protected long swapSize;
  
  public ManagedObjectReference getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(ManagedObjectReference paramManagedObjectReference) {
    this.datastore = paramManagedObjectReference;
  }
  
  public long getSwapSize() {
    return this.swapSize;
  }
  
  public void setSwapSize(long paramLong) {
    this.swapSize = paramLong;
  }
}
