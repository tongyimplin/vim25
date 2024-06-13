package com.vmware.vim25;

import com.vmware.vim25.HostStorageProtocol;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostStorageProtocol")
@XmlEnum
public enum HostStorageProtocol {
  SCSI("scsi"),
  NVME("nvme");
  
  private final String value;
  
  HostStorageProtocol(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostStorageProtocol fromValue(String paramString) {
    for (HostStorageProtocol hostStorageProtocol : values()) {
      if (hostStorageProtocol.value.equals(paramString))
        return hostStorageProtocol; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
