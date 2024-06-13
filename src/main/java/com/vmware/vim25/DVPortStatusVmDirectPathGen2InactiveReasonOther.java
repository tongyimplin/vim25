package com.vmware.vim25;

import com.vmware.vim25.DVPortStatusVmDirectPathGen2InactiveReasonOther;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DVPortStatusVmDirectPathGen2InactiveReasonOther")
@XmlEnum
public enum DVPortStatusVmDirectPathGen2InactiveReasonOther {
  PORT_NPT_INCOMPATIBLE_HOST("portNptIncompatibleHost"),
  PORT_NPT_INCOMPATIBLE_CONNECTEE("portNptIncompatibleConnectee");
  
  private final String value;
  
  DVPortStatusVmDirectPathGen2InactiveReasonOther(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static DVPortStatusVmDirectPathGen2InactiveReasonOther fromValue(String paramString) {
    for (DVPortStatusVmDirectPathGen2InactiveReasonOther dVPortStatusVmDirectPathGen2InactiveReasonOther : values()) {
      if (dVPortStatusVmDirectPathGen2InactiveReasonOther.value.equals(paramString))
        return dVPortStatusVmDirectPathGen2InactiveReasonOther; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
