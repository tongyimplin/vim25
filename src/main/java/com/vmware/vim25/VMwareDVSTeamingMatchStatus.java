package com.vmware.vim25;

import com.vmware.vim25.VMwareDVSTeamingMatchStatus;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VMwareDVSTeamingMatchStatus")
@XmlEnum
public enum VMwareDVSTeamingMatchStatus {
  IPHASH_MATCH("iphashMatch"),
  NON_IPHASH_MATCH("nonIphashMatch"),
  IPHASH_MISMATCH("iphashMismatch"),
  NON_IPHASH_MISMATCH("nonIphashMismatch");
  
  private final String value;
  
  VMwareDVSTeamingMatchStatus(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VMwareDVSTeamingMatchStatus fromValue(String paramString) {
    for (VMwareDVSTeamingMatchStatus vMwareDVSTeamingMatchStatus : values()) {
      if (vMwareDVSTeamingMatchStatus.value.equals(paramString))
        return vMwareDVSTeamingMatchStatus; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
