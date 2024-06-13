package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.IpPoolManagerIpAllocation;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IpPoolManagerIpAllocation", propOrder = {"ipAddress", "allocationId"})
public class IpPoolManagerIpAllocation extends DynamicData {
  @XmlElement(required = true)
  protected String ipAddress;
  
  @XmlElement(required = true)
  protected String allocationId;
  
  public String getIpAddress() {
    return this.ipAddress;
  }
  
  public void setIpAddress(String paramString) {
    this.ipAddress = paramString;
  }
  
  public String getAllocationId() {
    return this.allocationId;
  }
  
  public void setAllocationId(String paramString) {
    this.allocationId = paramString;
  }
}
