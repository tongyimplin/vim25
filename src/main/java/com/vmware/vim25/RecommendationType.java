package com.vmware.vim25;

import com.vmware.vim25.RecommendationType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "RecommendationType")
@XmlEnum
public enum RecommendationType {
  V_1("V1");
  
  private final String value;
  
  RecommendationType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static RecommendationType fromValue(String paramString) {
    for (RecommendationType recommendationType : values()) {
      if (recommendationType.value.equals(paramString))
        return recommendationType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
