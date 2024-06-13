package com.vmware.vim25;

import com.vmware.vim25.DvsResourceRuntimeInfo;
import com.vmware.vim25.DvsVmVnicNetworkResourcePoolRuntimeInfo;
import com.vmware.vim25.DvsVnicAllocatedResource;
import com.vmware.vim25.DynamicData;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsResourceRuntimeInfo", propOrder = {"capacity", "usage", "available", "allocatedResource", "vmVnicNetworkResourcePoolRuntime"})
public class DvsResourceRuntimeInfo extends DynamicData {
  protected Integer capacity;
  
  protected Integer usage;
  
  protected Integer available;
  
  protected List<DvsVnicAllocatedResource> allocatedResource;
  
  protected List<DvsVmVnicNetworkResourcePoolRuntimeInfo> vmVnicNetworkResourcePoolRuntime;
  
  public Integer getCapacity() {
    return this.capacity;
  }
  
  public void setCapacity(Integer paramInteger) {
    this.capacity = paramInteger;
  }
  
  public Integer getUsage() {
    return this.usage;
  }
  
  public void setUsage(Integer paramInteger) {
    this.usage = paramInteger;
  }
  
  public Integer getAvailable() {
    return this.available;
  }
  
  public void setAvailable(Integer paramInteger) {
    this.available = paramInteger;
  }
  
  public List<DvsVnicAllocatedResource> getAllocatedResource() {
    if (this.allocatedResource == null)
      this.allocatedResource = new ArrayList<>(); 
    return this.allocatedResource;
  }
  
  public List<DvsVmVnicNetworkResourcePoolRuntimeInfo> getVmVnicNetworkResourcePoolRuntime() {
    if (this.vmVnicNetworkResourcePoolRuntime == null)
      this.vmVnicNetworkResourcePoolRuntime = new ArrayList<>(); 
    return this.vmVnicNetworkResourcePoolRuntime;
  }
}
