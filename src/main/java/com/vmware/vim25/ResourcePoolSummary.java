package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ResourceConfigSpec;
import com.vmware.vim25.ResourcePoolQuickStats;
import com.vmware.vim25.ResourcePoolRuntimeInfo;
import com.vmware.vim25.ResourcePoolSummary;
import com.vmware.vim25.VirtualAppSummary;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourcePoolSummary", propOrder = {"name", "config", "runtime", "quickStats", "configuredMemoryMB"})
@XmlSeeAlso({VirtualAppSummary.class})
public class ResourcePoolSummary extends DynamicData {
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected ResourceConfigSpec config;
  
  @XmlElement(required = true)
  protected ResourcePoolRuntimeInfo runtime;
  
  protected ResourcePoolQuickStats quickStats;
  
  protected Integer configuredMemoryMB;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public ResourceConfigSpec getConfig() {
    return this.config;
  }
  
  public void setConfig(ResourceConfigSpec paramResourceConfigSpec) {
    this.config = paramResourceConfigSpec;
  }
  
  public ResourcePoolRuntimeInfo getRuntime() {
    return this.runtime;
  }
  
  public void setRuntime(ResourcePoolRuntimeInfo paramResourcePoolRuntimeInfo) {
    this.runtime = paramResourcePoolRuntimeInfo;
  }
  
  public ResourcePoolQuickStats getQuickStats() {
    return this.quickStats;
  }
  
  public void setQuickStats(ResourcePoolQuickStats paramResourcePoolQuickStats) {
    this.quickStats = paramResourcePoolQuickStats;
  }
  
  public Integer getConfiguredMemoryMB() {
    return this.configuredMemoryMB;
  }
  
  public void setConfiguredMemoryMB(Integer paramInteger) {
    this.configuredMemoryMB = paramInteger;
  }
}
