package com.vmware.vim25;

import com.vmware.vim25.RecommendationReasonCode;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "RecommendationReasonCode")
@XmlEnum
public enum RecommendationReasonCode {
  FAIRNESS_CPU_AVG("fairnessCpuAvg"),
  FAIRNESS_MEM_AVG("fairnessMemAvg"),
  JOINT_AFFIN("jointAffin"),
  ANTI_AFFIN("antiAffin"),
  HOST_MAINT("hostMaint"),
  ENTER_STANDBY("enterStandby"),
  RESERVATION_CPU("reservationCpu"),
  RESERVATION_MEM("reservationMem"),
  POWER_ON_VM("powerOnVm"),
  POWER_SAVING("powerSaving"),
  INCREASE_CAPACITY("increaseCapacity"),
  CHECK_RESOURCE("checkResource"),
  UNRESERVED_CAPACITY("unreservedCapacity"),
  VM_HOST_HARD_AFFINITY("vmHostHardAffinity"),
  VM_HOST_SOFT_AFFINITY("vmHostSoftAffinity"),
  BALANCE_DATASTORE_SPACE_USAGE("balanceDatastoreSpaceUsage"),
  BALANCE_DATASTORE_IO_LOAD("balanceDatastoreIOLoad"),
  BALANCE_DATASTORE_IOPS_RESERVATION("balanceDatastoreIOPSReservation"),
  DATASTORE_MAINT("datastoreMaint"),
  VIRTUAL_DISK_JOINT_AFFIN("virtualDiskJointAffin"),
  VIRTUAL_DISK_ANTI_AFFIN("virtualDiskAntiAffin"),
  DATASTORE_SPACE_OUTAGE("datastoreSpaceOutage"),
  STORAGE_PLACEMENT("storagePlacement"),
  IOLB_DISABLED_INTERNAL("iolbDisabledInternal"),
  XVMOTION_PLACEMENT("xvmotionPlacement"),
  NETWORK_BANDWIDTH_RESERVATION("networkBandwidthReservation"),
  HOST_IN_DEGRADATION("hostInDegradation"),
  HOST_EXIT_DEGRADATION("hostExitDegradation"),
  MAX_VMS_CONSTRAINT("maxVmsConstraint"),
  FT_CONSTRAINTS("ftConstraints"),
  VM_HOST_AFFINITY_POLICY("vmHostAffinityPolicy"),
  VM_HOST_ANTI_AFFINITY_POLICY("vmHostAntiAffinityPolicy"),
  VM_ANTI_AFFINITY_POLICY("vmAntiAffinityPolicy");
  
  private final String value;
  
  RecommendationReasonCode(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static RecommendationReasonCode fromValue(String paramString) {
    for (RecommendationReasonCode recommendationReasonCode : values()) {
      if (recommendationReasonCode.value.equals(paramString))
        return recommendationReasonCode; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
