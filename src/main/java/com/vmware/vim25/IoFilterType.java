package com.vmware.vim25;

import com.vmware.vim25.IoFilterType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "IoFilterType")
@XmlEnum
public enum IoFilterType {
  CACHE("cache"),
  REPLICATION("replication"),
  ENCRYPTION("encryption"),
  COMPRESSION("compression"),
  INSPECTION("inspection"),
  DATASTORE_IO_CONTROL("datastoreIoControl"),
  DATA_PROVIDER("dataProvider");
  
  private final String value;
  
  IoFilterType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static IoFilterType fromValue(String paramString) {
    for (IoFilterType ioFilterType : values()) {
      if (ioFilterType.value.equals(paramString))
        return ioFilterType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
