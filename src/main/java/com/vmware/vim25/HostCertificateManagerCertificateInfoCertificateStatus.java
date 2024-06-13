package com.vmware.vim25;

import com.vmware.vim25.HostCertificateManagerCertificateInfoCertificateStatus;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostCertificateManagerCertificateInfoCertificateStatus")
@XmlEnum
public enum HostCertificateManagerCertificateInfoCertificateStatus {
  UNKNOWN("unknown"),
  EXPIRED("expired"),
  EXPIRING("expiring"),
  EXPIRING_SHORTLY("expiringShortly"),
  EXPIRATION_IMMINENT("expirationImminent"),
  GOOD("good");
  
  private final String value;
  
  HostCertificateManagerCertificateInfoCertificateStatus(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostCertificateManagerCertificateInfoCertificateStatus fromValue(String paramString) {
    for (HostCertificateManagerCertificateInfoCertificateStatus hostCertificateManagerCertificateInfoCertificateStatus : values()) {
      if (hostCertificateManagerCertificateInfoCertificateStatus.value.equals(paramString))
        return hostCertificateManagerCertificateInfoCertificateStatus; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
