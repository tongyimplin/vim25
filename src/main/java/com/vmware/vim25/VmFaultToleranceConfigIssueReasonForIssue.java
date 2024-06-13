package com.vmware.vim25;

import com.vmware.vim25.VmFaultToleranceConfigIssueReasonForIssue;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VmFaultToleranceConfigIssueReasonForIssue")
@XmlEnum
public enum VmFaultToleranceConfigIssueReasonForIssue {
  HA_NOT_ENABLED("haNotEnabled"),
  MORE_THAN_ONE_SECONDARY("moreThanOneSecondary"),
  RECORD_REPLAY_NOT_SUPPORTED("recordReplayNotSupported"),
  REPLAY_NOT_SUPPORTED("replayNotSupported"),
  TEMPLATE_VM("templateVm"),
  MULTIPLE_VCPU("multipleVCPU"),
  HOST_INACTIVE("hostInactive"),
  FT_UNSUPPORTED_HARDWARE("ftUnsupportedHardware"),
  FT_UNSUPPORTED_PRODUCT("ftUnsupportedProduct"),
  MISSING_V_MOTION_NIC("missingVMotionNic"),
  MISSING_FT_LOGGING_NIC("missingFTLoggingNic"),
  THIN_DISK("thinDisk"),
  VERIFY_SSL_CERTIFICATE_FLAG_NOT_SET("verifySSLCertificateFlagNotSet"),
  HAS_SNAPSHOTS("hasSnapshots"),
  NO_CONFIG("noConfig"),
  FT_SECONDARY_VM("ftSecondaryVm"),
  HAS_LOCAL_DISK("hasLocalDisk"),
  ESX_AGENT_VM("esxAgentVm"),
  VIDEO_3_D_ENABLED("video3dEnabled"),
  HAS_UNSUPPORTED_DISK("hasUnsupportedDisk"),
  INSUFFICIENT_BANDWIDTH("insufficientBandwidth"),
  HAS_NESTED_HV_CONFIGURATION("hasNestedHVConfiguration"),
  HAS_V_FLASH_CONFIGURATION("hasVFlashConfiguration"),
  UNSUPPORTED_PRODUCT("unsupportedProduct"),
  CPU_HV_UNSUPPORTED("cpuHvUnsupported"),
  CPU_HWMMU_UNSUPPORTED("cpuHwmmuUnsupported"),
  CPU_HV_DISABLED("cpuHvDisabled"),
  HAS_EFI_FIRMWARE("hasEFIFirmware"),
  TOO_MANY_VCP_US("tooManyVCPUs"),
  TOO_MUCH_MEMORY("tooMuchMemory");
  
  private final String value;
  
  VmFaultToleranceConfigIssueReasonForIssue(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VmFaultToleranceConfigIssueReasonForIssue fromValue(String paramString) {
    for (VmFaultToleranceConfigIssueReasonForIssue vmFaultToleranceConfigIssueReasonForIssue : values()) {
      if (vmFaultToleranceConfigIssueReasonForIssue.value.equals(paramString))
        return vmFaultToleranceConfigIssueReasonForIssue; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
