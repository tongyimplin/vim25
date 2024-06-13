package com.vmware.vim25;

import com.vmware.vim25.ObjectUpdateKind;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ObjectUpdateKind")
@XmlEnum
public enum ObjectUpdateKind {
  MODIFY("modify"),
  ENTER("enter"),
  LEAVE("leave");
  
  private final String value;
  
  ObjectUpdateKind(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ObjectUpdateKind fromValue(String paramString) {
    for (ObjectUpdateKind objectUpdateKind : values()) {
      if (objectUpdateKind.value.equals(paramString))
        return objectUpdateKind; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
