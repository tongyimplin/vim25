package com.vmware.vim25;

import com.vmware.vim25.AgentInstallFailedReason;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "AgentInstallFailedReason")
@XmlEnum
public enum AgentInstallFailedReason {
  NOT_ENOUGH_SPACE_ON_DEVICE("NotEnoughSpaceOnDevice"),
  PREPARE_TO_UPGRADE_FAILED("PrepareToUpgradeFailed"),
  AGENT_NOT_RUNNING("AgentNotRunning"),
  AGENT_NOT_REACHABLE("AgentNotReachable"),
  INSTALL_TIMEDOUT("InstallTimedout"),
  SIGNATURE_VERIFICATION_FAILED("SignatureVerificationFailed"),
  AGENT_UPLOAD_FAILED("AgentUploadFailed"),
  AGENT_UPLOAD_TIMEDOUT("AgentUploadTimedout"),
  UNKNOWN_INSTALLER_ERROR("UnknownInstallerError");
  
  private final String value;
  
  AgentInstallFailedReason(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static AgentInstallFailedReason fromValue(String paramString) {
    for (AgentInstallFailedReason agentInstallFailedReason : values()) {
      if (agentInstallFailedReason.value.equals(paramString))
        return agentInstallFailedReason; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
