package com.vmware.vim25;

import com.vmware.vim25.HostProfileManagerCompositionResultResultElementStatus;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostProfileManagerCompositionResultResultElementStatus")
@XmlEnum
public enum HostProfileManagerCompositionResultResultElementStatus {
  SUCCESS("success"),
  ERROR("error");
  
  private final String value;
  
  HostProfileManagerCompositionResultResultElementStatus(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostProfileManagerCompositionResultResultElementStatus fromValue(String paramString) {
    for (HostProfileManagerCompositionResultResultElementStatus hostProfileManagerCompositionResultResultElementStatus : values()) {
      if (hostProfileManagerCompositionResultResultElementStatus.value.equals(paramString))
        return hostProfileManagerCompositionResultResultElementStatus; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
