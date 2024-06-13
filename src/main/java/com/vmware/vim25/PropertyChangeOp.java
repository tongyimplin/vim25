package com.vmware.vim25;

import com.vmware.vim25.PropertyChangeOp;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PropertyChangeOp")
@XmlEnum
public enum PropertyChangeOp {
  ADD("add"),
  REMOVE("remove"),
  ASSIGN("assign"),
  INDIRECT_REMOVE("indirectRemove");
  
  private final String value;
  
  PropertyChangeOp(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static PropertyChangeOp fromValue(String paramString) {
    for (PropertyChangeOp propertyChangeOp : values()) {
      if (propertyChangeOp.value.equals(paramString))
        return propertyChangeOp; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
