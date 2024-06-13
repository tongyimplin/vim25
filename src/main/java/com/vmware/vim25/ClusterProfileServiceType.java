package com.vmware.vim25;

import com.vmware.vim25.ClusterProfileServiceType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ClusterProfileServiceType")
@XmlEnum
public enum ClusterProfileServiceType {
  DRS, HA, DPM, FT;
  
  public String value() {
    return name();
  }
  
  public static ClusterProfileServiceType fromValue(String paramString) {
    return valueOf(paramString);
  }
}
