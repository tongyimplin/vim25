package com.vmware.vim25;

import com.vmware.vim25.HostNvmeTransportType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostNvmeTransportType")
@XmlEnum
public enum HostNvmeTransportType {
  PCIE("pcie"),
  FIBRE_CHANNEL("fibreChannel"),
  RDMA("rdma"),
  LOOPBACK("loopback"),
  UNSUPPORTED("unsupported");
  
  private final String value;
  
  HostNvmeTransportType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostNvmeTransportType fromValue(String paramString) {
    for (HostNvmeTransportType hostNvmeTransportType : values()) {
      if (hostNvmeTransportType.value.equals(paramString))
        return hostNvmeTransportType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
