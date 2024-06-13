package com.vmware.vim25;

import com.vmware.vim25.DasConfigFaultDasConfigFaultReason;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DasConfigFaultDasConfigFaultReason")
@XmlEnum
public enum DasConfigFaultDasConfigFaultReason {
  HOST_NETWORK_MISCONFIGURATION("HostNetworkMisconfiguration"),
  HOST_MISCONFIGURATION("HostMisconfiguration"),
  INSUFFICIENT_PRIVILEGES("InsufficientPrivileges"),
  NO_PRIMARY_AGENT_AVAILABLE("NoPrimaryAgentAvailable"),
  OTHER("Other"),
  NO_DATASTORES_CONFIGURED("NoDatastoresConfigured"),
  CREATE_CONFIG_VVOL_FAILED("CreateConfigVvolFailed"),
  V_SAN_NOT_SUPPORTED_ON_HOST("VSanNotSupportedOnHost"),
  DAS_NETWORK_MISCONFIGURATION("DasNetworkMisconfiguration"),
  SET_DESIRED_IMAGE_SPEC_FAILED("SetDesiredImageSpecFailed"),
  APPLY_HA_VIBS_ON_CLUSTER_FAILED("ApplyHAVibsOnClusterFailed");
  
  private final String value;
  
  DasConfigFaultDasConfigFaultReason(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static DasConfigFaultDasConfigFaultReason fromValue(String paramString) {
    for (DasConfigFaultDasConfigFaultReason dasConfigFaultDasConfigFaultReason : values()) {
      if (dasConfigFaultDasConfigFaultReason.value.equals(paramString))
        return dasConfigFaultDasConfigFaultReason; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
