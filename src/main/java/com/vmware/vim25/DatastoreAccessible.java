package com.vmware.vim25;

import com.vmware.vim25.DatastoreAccessible;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DatastoreAccessible")
@XmlEnum
public enum DatastoreAccessible {
  TRUE("True"),
  FALSE("False");
  
  private final String value;
  
  DatastoreAccessible(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static DatastoreAccessible fromValue(String paramString) {
    for (DatastoreAccessible datastoreAccessible : values()) {
      if (datastoreAccessible.value.equals(paramString))
        return datastoreAccessible; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
