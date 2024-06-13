package com.vmware.vim25;

import com.vmware.vim25.HostDigestInfoDigestMethodType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostDigestInfoDigestMethodType")
@XmlEnum
public enum HostDigestInfoDigestMethodType {
  SHA_1("SHA1"),
  MD_5("MD5"),
  SHA_256("SHA256"),
  SHA_384("SHA384"),
  SHA_512("SHA512"),
  SM_3_256("SM3_256");
  
  private final String value;
  
  HostDigestInfoDigestMethodType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostDigestInfoDigestMethodType fromValue(String paramString) {
    for (HostDigestInfoDigestMethodType hostDigestInfoDigestMethodType : values()) {
      if (hostDigestInfoDigestMethodType.value.equals(paramString))
        return hostDigestInfoDigestMethodType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
