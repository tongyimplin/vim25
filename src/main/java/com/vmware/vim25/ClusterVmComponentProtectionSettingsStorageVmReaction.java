package com.vmware.vim25;

import com.vmware.vim25.ClusterVmComponentProtectionSettingsStorageVmReaction;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ClusterVmComponentProtectionSettingsStorageVmReaction")
@XmlEnum
public enum ClusterVmComponentProtectionSettingsStorageVmReaction {
  DISABLED("disabled"),
  WARNING("warning"),
  RESTART_CONSERVATIVE("restartConservative"),
  RESTART_AGGRESSIVE("restartAggressive"),
  CLUSTER_DEFAULT("clusterDefault");
  
  private final String value;
  
  ClusterVmComponentProtectionSettingsStorageVmReaction(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ClusterVmComponentProtectionSettingsStorageVmReaction fromValue(String paramString) {
    for (ClusterVmComponentProtectionSettingsStorageVmReaction clusterVmComponentProtectionSettingsStorageVmReaction : values()) {
      if (clusterVmComponentProtectionSettingsStorageVmReaction.value.equals(paramString))
        return clusterVmComponentProtectionSettingsStorageVmReaction; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
