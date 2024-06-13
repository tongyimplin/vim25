package com.vmware.vim25;

import com.vmware.vim25.HostTpmAttestationInfoAcceptanceStatus;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostTpmAttestationInfoAcceptanceStatus")
@XmlEnum
public enum HostTpmAttestationInfoAcceptanceStatus {
  NOT_ACCEPTED("notAccepted"),
  ACCEPTED("accepted");
  
  private final String value;
  
  HostTpmAttestationInfoAcceptanceStatus(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostTpmAttestationInfoAcceptanceStatus fromValue(String paramString) {
    for (HostTpmAttestationInfoAcceptanceStatus hostTpmAttestationInfoAcceptanceStatus : values()) {
      if (hostTpmAttestationInfoAcceptanceStatus.value.equals(paramString))
        return hostTpmAttestationInfoAcceptanceStatus; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
