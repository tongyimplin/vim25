package com.vmware.vim25;

import com.vmware.vim25.ApplyHostProfileConfigurationResultStatus;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ApplyHostProfileConfigurationResultStatus")
@XmlEnum
public enum ApplyHostProfileConfigurationResultStatus {
  SUCCESS("success"),
  FAILED("failed"),
  REBOOT_FAILED("reboot_failed"),
  STATELESS_REBOOT_FAILED("stateless_reboot_failed"),
  CHECK_COMPLIANCE_FAILED("check_compliance_failed"),
  STATE_NOT_SATISFIED("state_not_satisfied"),
  EXIT_MAINTENANCEMODE_FAILED("exit_maintenancemode_failed"),
  CANCELED("canceled");
  
  private final String value;
  
  ApplyHostProfileConfigurationResultStatus(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ApplyHostProfileConfigurationResultStatus fromValue(String paramString) {
    for (ApplyHostProfileConfigurationResultStatus applyHostProfileConfigurationResultStatus : values()) {
      if (applyHostProfileConfigurationResultStatus.value.equals(paramString))
        return applyHostProfileConfigurationResultStatus; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
