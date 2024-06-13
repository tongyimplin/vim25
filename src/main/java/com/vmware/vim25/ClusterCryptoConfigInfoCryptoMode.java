package com.vmware.vim25;

import com.vmware.vim25.ClusterCryptoConfigInfoCryptoMode;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ClusterCryptoConfigInfoCryptoMode")
@XmlEnum
public enum ClusterCryptoConfigInfoCryptoMode {
  ON_DEMAND("onDemand"),
  FORCE_ENABLE("forceEnable");
  
  private final String value;
  
  ClusterCryptoConfigInfoCryptoMode(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ClusterCryptoConfigInfoCryptoMode fromValue(String paramString) {
    for (ClusterCryptoConfigInfoCryptoMode clusterCryptoConfigInfoCryptoMode : values()) {
      if (clusterCryptoConfigInfoCryptoMode.value.equals(paramString))
        return clusterCryptoConfigInfoCryptoMode; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
