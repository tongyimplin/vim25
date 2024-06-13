package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchHostInfrastructureTrafficClass;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DistributedVirtualSwitchHostInfrastructureTrafficClass")
@XmlEnum
public enum DistributedVirtualSwitchHostInfrastructureTrafficClass {
  MANAGEMENT("management"),
  FAULT_TOLERANCE("faultTolerance"),
  VMOTION("vmotion"),
  VIRTUAL_MACHINE("virtualMachine"),
  I_SCSI("iSCSI"),
  NFS("nfs"),
  HBR("hbr"),
  VSAN("vsan"),
  VDP("vdp");
  
  private final String value;
  
  DistributedVirtualSwitchHostInfrastructureTrafficClass(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static DistributedVirtualSwitchHostInfrastructureTrafficClass fromValue(String paramString) {
    for (DistributedVirtualSwitchHostInfrastructureTrafficClass distributedVirtualSwitchHostInfrastructureTrafficClass : values()) {
      if (distributedVirtualSwitchHostInfrastructureTrafficClass.value.equals(paramString))
        return distributedVirtualSwitchHostInfrastructureTrafficClass; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
