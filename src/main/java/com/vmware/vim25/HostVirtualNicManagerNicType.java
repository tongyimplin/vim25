package com.vmware.vim25;

import com.vmware.vim25.HostVirtualNicManagerNicType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostVirtualNicManagerNicType")
@XmlEnum
public enum HostVirtualNicManagerNicType {
  VMOTION("vmotion"),
  FAULT_TOLERANCE_LOGGING("faultToleranceLogging"),
  V_SPHERE_REPLICATION("vSphereReplication"),
  V_SPHERE_REPLICATION_NFC("vSphereReplicationNFC"),
  MANAGEMENT("management"),
  VSAN("vsan"),
  V_SPHERE_PROVISIONING("vSphereProvisioning"),
  VSAN_WITNESS("vsanWitness"),
  V_SPHERE_BACKUP_NFC("vSphereBackupNFC"),
  PTP("ptp");
  
  private final String value;
  
  HostVirtualNicManagerNicType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostVirtualNicManagerNicType fromValue(String paramString) {
    for (HostVirtualNicManagerNicType hostVirtualNicManagerNicType : values()) {
      if (hostVirtualNicManagerNicType.value.equals(paramString))
        return hostVirtualNicManagerNicType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
