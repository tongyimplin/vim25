package com.vmware.vim25;

import com.vmware.vim25.HostIncompatibleForRecordReplayReason;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostIncompatibleForRecordReplayReason")
@XmlEnum
public enum HostIncompatibleForRecordReplayReason {
  PRODUCT("product"),
  PROCESSOR("processor");
  
  private final String value;
  
  HostIncompatibleForRecordReplayReason(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostIncompatibleForRecordReplayReason fromValue(String paramString) {
    for (HostIncompatibleForRecordReplayReason hostIncompatibleForRecordReplayReason : values()) {
      if (hostIncompatibleForRecordReplayReason.value.equals(paramString))
        return hostIncompatibleForRecordReplayReason; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
