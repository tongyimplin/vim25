package com.vmware.vim25;

import com.vmware.vim25.DVSNetworkResourcePoolAllocationInfo;
import com.vmware.vim25.DVSNetworkResourcePoolConfigSpec;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSNetworkResourcePoolConfigSpec", propOrder = {"key", "configVersion", "allocationInfo", "name", "description"})
public class DVSNetworkResourcePoolConfigSpec extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  protected String configVersion;
  
  protected DVSNetworkResourcePoolAllocationInfo allocationInfo;
  
  protected String name;
  
  protected String description;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getConfigVersion() {
    return this.configVersion;
  }
  
  public void setConfigVersion(String paramString) {
    this.configVersion = paramString;
  }
  
  public DVSNetworkResourcePoolAllocationInfo getAllocationInfo() {
    return this.allocationInfo;
  }
  
  public void setAllocationInfo(DVSNetworkResourcePoolAllocationInfo paramDVSNetworkResourcePoolAllocationInfo) {
    this.allocationInfo = paramDVSNetworkResourcePoolAllocationInfo;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
}
