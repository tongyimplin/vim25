package com.vmware.vim25;

import com.vmware.vim25.QuarantineModeFaultFaultType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "QuarantineModeFaultFaultType")
@XmlEnum
public enum QuarantineModeFaultFaultType {
  NO_COMPATIBLE_NON_QUARANTINED_HOST("NoCompatibleNonQuarantinedHost"),
  CORRECTION_DISALLOWED("CorrectionDisallowed"),
  CORRECTION_IMPACT("CorrectionImpact");
  
  private final String value;
  
  QuarantineModeFaultFaultType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static QuarantineModeFaultFaultType fromValue(String paramString) {
    for (QuarantineModeFaultFaultType quarantineModeFaultFaultType : values()) {
      if (quarantineModeFaultFaultType.value.equals(paramString))
        return quarantineModeFaultFaultType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
