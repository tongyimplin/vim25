package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualPortgroupProblem;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalizedMethodFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualPortgroupProblem", propOrder = {"logicalSwitchUuid", "fault"})
public class DistributedVirtualPortgroupProblem extends DynamicData {
  @XmlElement(required = true)
  protected String logicalSwitchUuid;
  
  @XmlElement(required = true)
  protected LocalizedMethodFault fault;
  
  public String getLogicalSwitchUuid() {
    return this.logicalSwitchUuid;
  }
  
  public void setLogicalSwitchUuid(String paramString) {
    this.logicalSwitchUuid = paramString;
  }
  
  public LocalizedMethodFault getFault() {
    return this.fault;
  }
  
  public void setFault(LocalizedMethodFault paramLocalizedMethodFault) {
    this.fault = paramLocalizedMethodFault;
  }
}
