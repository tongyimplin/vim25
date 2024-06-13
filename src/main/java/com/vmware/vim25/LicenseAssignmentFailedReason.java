package com.vmware.vim25;

import com.vmware.vim25.LicenseAssignmentFailedReason;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "LicenseAssignmentFailedReason")
@XmlEnum
public enum LicenseAssignmentFailedReason {
  KEY_ENTITY_MISMATCH("keyEntityMismatch"),
  DOWNGRADE_DISALLOWED("downgradeDisallowed"),
  INVENTORY_NOT_MANAGEABLE_BY_VIRTUAL_CENTER("inventoryNotManageableByVirtualCenter"),
  HOSTS_UNMANAGEABLE_BY_VIRTUAL_CENTER_WITHOUT_LICENSE_SERVER("hostsUnmanageableByVirtualCenterWithoutLicenseServer");
  
  private final String value;
  
  LicenseAssignmentFailedReason(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static LicenseAssignmentFailedReason fromValue(String paramString) {
    for (LicenseAssignmentFailedReason licenseAssignmentFailedReason : values()) {
      if (licenseAssignmentFailedReason.value.equals(paramString))
        return licenseAssignmentFailedReason; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
