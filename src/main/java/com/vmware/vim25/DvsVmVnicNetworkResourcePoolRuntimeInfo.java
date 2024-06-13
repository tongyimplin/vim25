package com.vmware.vim25;

import com.vmware.vim25.DvsVmVnicNetworkResourcePoolRuntimeInfo;
import com.vmware.vim25.DvsVnicAllocatedResource;
import com.vmware.vim25.DynamicData;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsVmVnicNetworkResourcePoolRuntimeInfo", propOrder = {"key", "name", "capacity", "usage", "available", "status", "allocatedResource"})
public class DvsVmVnicNetworkResourcePoolRuntimeInfo extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  protected String name;
  
  protected Integer capacity;
  
  protected Integer usage;
  
  protected Integer available;
  
  @XmlElement(required = true)
  protected String status;
  
  protected List<DvsVnicAllocatedResource> allocatedResource;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
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
  
  public String getStatus() {
    return this.status;
  }
  
  public void setStatus(String paramString) {
    this.status = paramString;
  }
  
  public List<DvsVnicAllocatedResource> getAllocatedResource() {
    if (this.allocatedResource == null)
      this.allocatedResource = new ArrayList<>(); 
    return this.allocatedResource;
  }
}
