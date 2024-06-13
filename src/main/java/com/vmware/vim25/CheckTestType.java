package com.vmware.vim25;

import com.vmware.vim25.CheckTestType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "CheckTestType")
@XmlEnum
public enum CheckTestType {
  SOURCE_TESTS("sourceTests"),
  HOST_TESTS("hostTests"),
  RESOURCE_POOL_TESTS("resourcePoolTests"),
  DATASTORE_TESTS("datastoreTests"),
  NETWORK_TESTS("networkTests");
  
  private final String value;
  
  CheckTestType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static CheckTestType fromValue(String paramString) {
    for (CheckTestType checkTestType : values()) {
      if (checkTestType.value.equals(paramString))
        return checkTestType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
