package com.vmware.vim25;

import com.vmware.vim25.ClusterVmComponentProtectionSettingsVmReactionOnAPDCleared;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ClusterVmComponentProtectionSettingsVmReactionOnAPDCleared")
@XmlEnum
public enum ClusterVmComponentProtectionSettingsVmReactionOnAPDCleared {
  NONE("none"),
  RESET("reset"),
  USE_CLUSTER_DEFAULT("useClusterDefault");
  
  private final String value;
  
  ClusterVmComponentProtectionSettingsVmReactionOnAPDCleared(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ClusterVmComponentProtectionSettingsVmReactionOnAPDCleared fromValue(String paramString) {
    for (ClusterVmComponentProtectionSettingsVmReactionOnAPDCleared clusterVmComponentProtectionSettingsVmReactionOnAPDCleared : values()) {
      if (clusterVmComponentProtectionSettingsVmReactionOnAPDCleared.value.equals(paramString))
        return clusterVmComponentProtectionSettingsVmReactionOnAPDCleared; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
