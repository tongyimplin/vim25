package com.vmware.vim25;

import com.vmware.vim25.ReplicationDiskConfigFaultReasonForFault;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ReplicationDiskConfigFaultReasonForFault")
@XmlEnum
public enum ReplicationDiskConfigFaultReasonForFault {
  DISK_NOT_FOUND("diskNotFound"),
  DISK_TYPE_NOT_SUPPORTED("diskTypeNotSupported"),
  INVALID_DISK_KEY("invalidDiskKey"),
  INVALID_DISK_REPLICATION_ID("invalidDiskReplicationId"),
  DUPLICATE_DISK_REPLICATION_ID("duplicateDiskReplicationId"),
  INVALID_PERSISTENT_FILE_PATH("invalidPersistentFilePath"),
  RECONFIGURE_DISK_REPLICATION_ID_NOT_ALLOWED("reconfigureDiskReplicationIdNotAllowed");
  
  private final String value;
  
  ReplicationDiskConfigFaultReasonForFault(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ReplicationDiskConfigFaultReasonForFault fromValue(String paramString) {
    for (ReplicationDiskConfigFaultReasonForFault replicationDiskConfigFaultReasonForFault : values()) {
      if (replicationDiskConfigFaultReasonForFault.value.equals(paramString))
        return replicationDiskConfigFaultReasonForFault; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
