package com.vmware.vim25;

import com.vmware.vim25.IoFilterOperation;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "IoFilterOperation")
@XmlEnum
public enum IoFilterOperation {
  INSTALL("install"),
  UNINSTALL("uninstall"),
  UPGRADE("upgrade");
  
  private final String value;
  
  IoFilterOperation(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static IoFilterOperation fromValue(String paramString) {
    for (IoFilterOperation ioFilterOperation : values()) {
      if (ioFilterOperation.value.equals(paramString))
        return ioFilterOperation; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
