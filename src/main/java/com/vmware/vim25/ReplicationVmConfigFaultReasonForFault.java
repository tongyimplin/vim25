package com.vmware.vim25;

import com.vmware.vim25.ReplicationVmConfigFaultReasonForFault;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ReplicationVmConfigFaultReasonForFault")
@XmlEnum
public enum ReplicationVmConfigFaultReasonForFault {
  INCOMPATIBLE_HW_VERSION("incompatibleHwVersion"),
  INVALID_VM_REPLICATION_ID("invalidVmReplicationId"),
  INVALID_GENERATION_NUMBER("invalidGenerationNumber"),
  OUT_OF_BOUNDS_RPO_VALUE("outOfBoundsRpoValue"),
  INVALID_DESTINATION_IP_ADDRESS("invalidDestinationIpAddress"),
  INVALID_DESTINATION_PORT("invalidDestinationPort"),
  INVALID_EXTRA_VM_OPTIONS("invalidExtraVmOptions"),
  STALE_GENERATION_NUMBER("staleGenerationNumber"),
  RECONFIGURE_VM_REPLICATION_ID_NOT_ALLOWED("reconfigureVmReplicationIdNotAllowed"),
  CANNOT_RETRIEVE_VM_REPLICATION_CONFIGURATION("cannotRetrieveVmReplicationConfiguration"),
  REPLICATION_ALREADY_ENABLED("replicationAlreadyEnabled"),
  INVALID_PRIOR_CONFIGURATION("invalidPriorConfiguration"),
  REPLICATION_NOT_ENABLED("replicationNotEnabled"),
  REPLICATION_CONFIGURATION_FAILED("replicationConfigurationFailed"),
  ENCRYPTED_VM("encryptedVm"),
  INVALID_THUMBPRINT("invalidThumbprint"),
  INCOMPATIBLE_DEVICE("incompatibleDevice");
  
  private final String value;
  
  ReplicationVmConfigFaultReasonForFault(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ReplicationVmConfigFaultReasonForFault fromValue(String paramString) {
    for (ReplicationVmConfigFaultReasonForFault replicationVmConfigFaultReasonForFault : values()) {
      if (replicationVmConfigFaultReasonForFault.value.equals(paramString))
        return replicationVmConfigFaultReasonForFault; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
