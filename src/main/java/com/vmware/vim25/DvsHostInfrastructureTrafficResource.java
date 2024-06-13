package com.vmware.vim25;

import com.vmware.vim25.DvsHostInfrastructureTrafficResource;
import com.vmware.vim25.DvsHostInfrastructureTrafficResourceAllocation;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsHostInfrastructureTrafficResource", propOrder = {"key", "description", "allocationInfo"})
public class DvsHostInfrastructureTrafficResource extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  protected String description;
  
  @XmlElement(required = true)
  protected DvsHostInfrastructureTrafficResourceAllocation allocationInfo;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public DvsHostInfrastructureTrafficResourceAllocation getAllocationInfo() {
    return this.allocationInfo;
  }
  
  public void setAllocationInfo(DvsHostInfrastructureTrafficResourceAllocation paramDvsHostInfrastructureTrafficResourceAllocation) {
    this.allocationInfo = paramDvsHostInfrastructureTrafficResourceAllocation;
  }
}
