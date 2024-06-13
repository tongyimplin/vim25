package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchProductSpecOperationType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DistributedVirtualSwitchProductSpecOperationType")
@XmlEnum
public enum DistributedVirtualSwitchProductSpecOperationType {
  PRE_INSTALL("preInstall"),
  UPGRADE("upgrade"),
  NOTIFY_AVAILABLE_UPGRADE("notifyAvailableUpgrade"),
  PROCEED_WITH_UPGRADE("proceedWithUpgrade"),
  UPDATE_BUNDLE_INFO("updateBundleInfo");
  
  private final String value;
  
  DistributedVirtualSwitchProductSpecOperationType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static DistributedVirtualSwitchProductSpecOperationType fromValue(String paramString) {
    for (DistributedVirtualSwitchProductSpecOperationType distributedVirtualSwitchProductSpecOperationType : values()) {
      if (distributedVirtualSwitchProductSpecOperationType.value.equals(paramString))
        return distributedVirtualSwitchProductSpecOperationType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
