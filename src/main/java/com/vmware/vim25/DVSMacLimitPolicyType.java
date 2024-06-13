package com.vmware.vim25;

import com.vmware.vim25.DVSMacLimitPolicyType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DVSMacLimitPolicyType")
@XmlEnum
public enum DVSMacLimitPolicyType {
  ALLOW("allow"),
  DROP("drop");
  
  private final String value;
  
  DVSMacLimitPolicyType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static DVSMacLimitPolicyType fromValue(String paramString) {
    for (DVSMacLimitPolicyType dVSMacLimitPolicyType : values()) {
      if (dVSMacLimitPolicyType.value.equals(paramString))
        return dVSMacLimitPolicyType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
