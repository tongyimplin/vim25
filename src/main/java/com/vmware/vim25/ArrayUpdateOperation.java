package com.vmware.vim25;

import com.vmware.vim25.ArrayUpdateOperation;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ArrayUpdateOperation")
@XmlEnum
public enum ArrayUpdateOperation {
  ADD("add"),
  REMOVE("remove"),
  EDIT("edit");
  
  private final String value;
  
  ArrayUpdateOperation(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ArrayUpdateOperation fromValue(String paramString) {
    for (ArrayUpdateOperation arrayUpdateOperation : values()) {
      if (arrayUpdateOperation.value.equals(paramString))
        return arrayUpdateOperation; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
