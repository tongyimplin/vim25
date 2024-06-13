package com.vmware.vim25;

import com.vmware.vim25.HostProfileManagerCompositionValidationResultResultElementStatus;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostProfileManagerCompositionValidationResultResultElementStatus")
@XmlEnum
public enum HostProfileManagerCompositionValidationResultResultElementStatus {
  SUCCESS("success"),
  ERROR("error");
  
  private final String value;
  
  HostProfileManagerCompositionValidationResultResultElementStatus(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostProfileManagerCompositionValidationResultResultElementStatus fromValue(String paramString) {
    for (HostProfileManagerCompositionValidationResultResultElementStatus hostProfileManagerCompositionValidationResultResultElementStatus : values()) {
      if (hostProfileManagerCompositionValidationResultResultElementStatus.value.equals(paramString))
        return hostProfileManagerCompositionValidationResultResultElementStatus; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
