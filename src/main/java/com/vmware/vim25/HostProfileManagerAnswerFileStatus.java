package com.vmware.vim25;

import com.vmware.vim25.HostProfileManagerAnswerFileStatus;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostProfileManagerAnswerFileStatus")
@XmlEnum
public enum HostProfileManagerAnswerFileStatus {
  VALID("valid"),
  INVALID("invalid"),
  UNKNOWN("unknown");
  
  private final String value;
  
  HostProfileManagerAnswerFileStatus(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostProfileManagerAnswerFileStatus fromValue(String paramString) {
    for (HostProfileManagerAnswerFileStatus hostProfileManagerAnswerFileStatus : values()) {
      if (hostProfileManagerAnswerFileStatus.value.equals(paramString))
        return hostProfileManagerAnswerFileStatus; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
