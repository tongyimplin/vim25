package com.vmware.vim25;

import com.vmware.vim25.HostSgxInfoSgxStates;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostSgxInfoSgxStates")
@XmlEnum
public enum HostSgxInfoSgxStates {
  NOT_PRESENT("notPresent"),
  DISABLED_BIOS("disabledBIOS"),
  DISABLED_CFW_101("disabledCFW101"),
  DISABLED_CPU_MISMATCH("disabledCPUMismatch"),
  DISABLED_NO_FLC("disabledNoFLC"),
  DISABLED_NUMA_UNSUP("disabledNUMAUnsup"),
  DISABLED_MAX_EPC_REGS("disabledMaxEPCRegs"),
  ENABLED("enabled");
  
  private final String value;
  
  HostSgxInfoSgxStates(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostSgxInfoSgxStates fromValue(String paramString) {
    for (HostSgxInfoSgxStates hostSgxInfoSgxStates : values()) {
      if (hostSgxInfoSgxStates.value.equals(paramString))
        return hostSgxInfoSgxStates; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
