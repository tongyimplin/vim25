package com.vmware.vim25;

import com.vmware.vim25.HostNvmeTransportParametersNvmeAddressFamily;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostNvmeTransportParametersNvmeAddressFamily")
@XmlEnum
public enum HostNvmeTransportParametersNvmeAddressFamily {
  IPV_4("ipv4"),
  IPV_6("ipv6"),
  INFINI_BAND("infiniBand"),
  FC("fc"),
  LOOPBACK("loopback"),
  UNKNOWN("unknown");
  
  private final String value;
  
  HostNvmeTransportParametersNvmeAddressFamily(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostNvmeTransportParametersNvmeAddressFamily fromValue(String paramString) {
    for (HostNvmeTransportParametersNvmeAddressFamily hostNvmeTransportParametersNvmeAddressFamily : values()) {
      if (hostNvmeTransportParametersNvmeAddressFamily.value.equals(paramString))
        return hostNvmeTransportParametersNvmeAddressFamily; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
