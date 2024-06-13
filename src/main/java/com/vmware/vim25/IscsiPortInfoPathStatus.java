package com.vmware.vim25;

import com.vmware.vim25.IscsiPortInfoPathStatus;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "IscsiPortInfoPathStatus")
@XmlEnum
public enum IscsiPortInfoPathStatus {
  NOT_USED("notUsed"),
  ACTIVE("active"),
  STAND_BY("standBy"),
  LAST_ACTIVE("lastActive");
  
  private final String value;
  
  IscsiPortInfoPathStatus(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static IscsiPortInfoPathStatus fromValue(String paramString) {
    for (IscsiPortInfoPathStatus iscsiPortInfoPathStatus : values()) {
      if (iscsiPortInfoPathStatus.value.equals(paramString))
        return iscsiPortInfoPathStatus; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
