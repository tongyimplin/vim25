package com.vmware.vim25;

import com.vmware.vim25.HostNetStackInstanceCongestionControlAlgorithmType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostNetStackInstanceCongestionControlAlgorithmType")
@XmlEnum
public enum HostNetStackInstanceCongestionControlAlgorithmType {
  NEWRENO("newreno"),
  CUBIC("cubic");
  
  private final String value;
  
  HostNetStackInstanceCongestionControlAlgorithmType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostNetStackInstanceCongestionControlAlgorithmType fromValue(String paramString) {
    for (HostNetStackInstanceCongestionControlAlgorithmType hostNetStackInstanceCongestionControlAlgorithmType : values()) {
      if (hostNetStackInstanceCongestionControlAlgorithmType.value.equals(paramString))
        return hostNetStackInstanceCongestionControlAlgorithmType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
