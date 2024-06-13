package com.vmware.vim25;

import com.vmware.vim25.DisallowedChangeByServiceDisallowedChange;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DisallowedChangeByServiceDisallowedChange")
@XmlEnum
public enum DisallowedChangeByServiceDisallowedChange {
  HOT_EXTEND_DISK("hotExtendDisk");
  
  private final String value;
  
  DisallowedChangeByServiceDisallowedChange(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static DisallowedChangeByServiceDisallowedChange fromValue(String paramString) {
    for (DisallowedChangeByServiceDisallowedChange disallowedChangeByServiceDisallowedChange : values()) {
      if (disallowedChangeByServiceDisallowedChange.value.equals(paramString))
        return disallowedChangeByServiceDisallowedChange; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
