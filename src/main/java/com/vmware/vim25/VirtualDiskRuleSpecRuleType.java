package com.vmware.vim25;

import com.vmware.vim25.VirtualDiskRuleSpecRuleType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualDiskRuleSpecRuleType")
@XmlEnum
public enum VirtualDiskRuleSpecRuleType {
  AFFINITY("affinity"),
  ANTI_AFFINITY("antiAffinity"),
  DISABLED("disabled");
  
  private final String value;
  
  VirtualDiskRuleSpecRuleType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualDiskRuleSpecRuleType fromValue(String paramString) {
    for (VirtualDiskRuleSpecRuleType virtualDiskRuleSpecRuleType : values()) {
      if (virtualDiskRuleSpecRuleType.value.equals(paramString))
        return virtualDiskRuleSpecRuleType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
