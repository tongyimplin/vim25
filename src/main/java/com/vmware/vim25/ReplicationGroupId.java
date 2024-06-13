package com.vmware.vim25;

import com.vmware.vim25.DeviceGroupId;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FaultDomainId;
import com.vmware.vim25.ReplicationGroupId;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplicationGroupId", propOrder = {"faultDomainId", "deviceGroupId"})
public class ReplicationGroupId extends DynamicData {
  @XmlElement(required = true)
  protected FaultDomainId faultDomainId;
  
  @XmlElement(required = true)
  protected DeviceGroupId deviceGroupId;
  
  public FaultDomainId getFaultDomainId() {
    return this.faultDomainId;
  }
  
  public void setFaultDomainId(FaultDomainId paramFaultDomainId) {
    this.faultDomainId = paramFaultDomainId;
  }
  
  public DeviceGroupId getDeviceGroupId() {
    return this.deviceGroupId;
  }
  
  public void setDeviceGroupId(DeviceGroupId paramDeviceGroupId) {
    this.deviceGroupId = paramDeviceGroupId;
  }
}
