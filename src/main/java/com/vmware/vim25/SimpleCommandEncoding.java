package com.vmware.vim25;

import com.vmware.vim25.SimpleCommandEncoding;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "SimpleCommandEncoding")
@XmlEnum
public enum SimpleCommandEncoding {
  CSV, HEX, STRING;
  
  public String value() {
    return name();
  }
  
  public static SimpleCommandEncoding fromValue(String paramString) {
    return valueOf(paramString);
  }
}
