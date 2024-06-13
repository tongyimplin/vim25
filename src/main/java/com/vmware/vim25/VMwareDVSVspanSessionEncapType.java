package com.vmware.vim25;

import com.vmware.vim25.VMwareDVSVspanSessionEncapType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VMwareDVSVspanSessionEncapType")
@XmlEnum
public enum VMwareDVSVspanSessionEncapType {
  GRE("gre"),
  ERSPAN_2("erspan2"),
  ERSPAN_3("erspan3");
  
  private final String value;
  
  VMwareDVSVspanSessionEncapType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VMwareDVSVspanSessionEncapType fromValue(String paramString) {
    for (VMwareDVSVspanSessionEncapType vMwareDVSVspanSessionEncapType : values()) {
      if (vMwareDVSVspanSessionEncapType.value.equals(paramString))
        return vMwareDVSVspanSessionEncapType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
