package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedEntityStatus;
import com.vmware.vim25.ResourcePoolResourceUsage;
import com.vmware.vim25.ResourcePoolRuntimeInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourcePoolRuntimeInfo", propOrder = {"memory", "cpu", "overallStatus", "sharesScalable"})
public class ResourcePoolRuntimeInfo extends DynamicData {
  @XmlElement(required = true)
  protected ResourcePoolResourceUsage memory;
  
  @XmlElement(required = true)
  protected ResourcePoolResourceUsage cpu;
  
  @XmlElement(required = true)
  protected ManagedEntityStatus overallStatus;
  
  protected String sharesScalable;
  
  public ResourcePoolResourceUsage getMemory() {
    return this.memory;
  }
  
  public void setMemory(ResourcePoolResourceUsage paramResourcePoolResourceUsage) {
    this.memory = paramResourcePoolResourceUsage;
  }
  
  public ResourcePoolResourceUsage getCpu() {
    return this.cpu;
  }
  
  public void setCpu(ResourcePoolResourceUsage paramResourcePoolResourceUsage) {
    this.cpu = paramResourcePoolResourceUsage;
  }
  
  public ManagedEntityStatus getOverallStatus() {
    return this.overallStatus;
  }
  
  public void setOverallStatus(ManagedEntityStatus paramManagedEntityStatus) {
    this.overallStatus = paramManagedEntityStatus;
  }
  
  public String getSharesScalable() {
    return this.sharesScalable;
  }
  
  public void setSharesScalable(String paramString) {
    this.sharesScalable = paramString;
  }
}
