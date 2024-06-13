package com.vmware.vim25;

import com.vmware.vim25.SharesLevel;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "SharesLevel")
@XmlEnum
public enum SharesLevel {
  LOW("low"),
  NORMAL("normal"),
  HIGH("high"),
  CUSTOM("custom");
  
  private final String value;
  
  SharesLevel(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static SharesLevel fromValue(String paramString) {
    for (SharesLevel sharesLevel : values()) {
      if (sharesLevel.value.equals(paramString))
        return sharesLevel; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
