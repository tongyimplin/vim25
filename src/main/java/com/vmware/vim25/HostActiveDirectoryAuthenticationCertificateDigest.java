package com.vmware.vim25;

import com.vmware.vim25.HostActiveDirectoryAuthenticationCertificateDigest;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostActiveDirectoryAuthenticationCertificateDigest")
@XmlEnum
public enum HostActiveDirectoryAuthenticationCertificateDigest {
  SHA_1("SHA1");
  
  private final String value;
  
  HostActiveDirectoryAuthenticationCertificateDigest(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostActiveDirectoryAuthenticationCertificateDigest fromValue(String paramString) {
    for (HostActiveDirectoryAuthenticationCertificateDigest hostActiveDirectoryAuthenticationCertificateDigest : values()) {
      if (hostActiveDirectoryAuthenticationCertificateDigest.value.equals(paramString))
        return hostActiveDirectoryAuthenticationCertificateDigest; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
