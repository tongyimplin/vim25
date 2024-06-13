package com.vmware.vim25;

import com.vmware.vim25.ReplicationVmFaultReasonForFault;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ReplicationVmFaultReasonForFault")
@XmlEnum
public enum ReplicationVmFaultReasonForFault {
  NOT_CONFIGURED("notConfigured"),
  POWERED_OFF("poweredOff"),
  SUSPENDED("suspended"),
  POWERED_ON("poweredOn"),
  OFFLINE_REPLICATING("offlineReplicating"),
  INVALID_STATE("invalidState"),
  INVALID_INSTANCE_ID("invalidInstanceId"),
  CLOSE_DISK_ERROR("closeDiskError"),
  GROUP_EXIST("groupExist");
  
  private final String value;
  
  ReplicationVmFaultReasonForFault(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ReplicationVmFaultReasonForFault fromValue(String paramString) {
    for (ReplicationVmFaultReasonForFault replicationVmFaultReasonForFault : values()) {
      if (replicationVmFaultReasonForFault.value.equals(paramString))
        return replicationVmFaultReasonForFault; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
