package com.vmware.vim25;

import com.vmware.vim25.HostDateTimeInfoProtocol;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostDateTimeInfoProtocol")
@XmlEnum
public enum HostDateTimeInfoProtocol {
  NTP("ntp"),
  PTP("ptp");
  
  private final String value;
  
  HostDateTimeInfoProtocol(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostDateTimeInfoProtocol fromValue(String paramString) {
    for (HostDateTimeInfoProtocol hostDateTimeInfoProtocol : values()) {
      if (hostDateTimeInfoProtocol.value.equals(paramString))
        return hostDateTimeInfoProtocol; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
