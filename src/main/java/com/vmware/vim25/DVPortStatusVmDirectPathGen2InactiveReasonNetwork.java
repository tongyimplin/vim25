package com.vmware.vim25;

import com.vmware.vim25.DVPortStatusVmDirectPathGen2InactiveReasonNetwork;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DVPortStatusVmDirectPathGen2InactiveReasonNetwork")
@XmlEnum
public enum DVPortStatusVmDirectPathGen2InactiveReasonNetwork {
  PORT_NPT_INCOMPATIBLE_DVS("portNptIncompatibleDvs"),
  PORT_NPT_NO_COMPATIBLE_NICS("portNptNoCompatibleNics"),
  PORT_NPT_NO_VIRTUAL_FUNCTIONS_AVAILABLE("portNptNoVirtualFunctionsAvailable"),
  PORT_NPT_DISABLED_FOR_PORT("portNptDisabledForPort");
  
  private final String value;
  
  DVPortStatusVmDirectPathGen2InactiveReasonNetwork(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static DVPortStatusVmDirectPathGen2InactiveReasonNetwork fromValue(String paramString) {
    for (DVPortStatusVmDirectPathGen2InactiveReasonNetwork dVPortStatusVmDirectPathGen2InactiveReasonNetwork : values()) {
      if (dVPortStatusVmDirectPathGen2InactiveReasonNetwork.value.equals(paramString))
        return dVPortStatusVmDirectPathGen2InactiveReasonNetwork; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
