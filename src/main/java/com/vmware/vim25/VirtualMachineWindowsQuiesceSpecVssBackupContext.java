package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineWindowsQuiesceSpecVssBackupContext;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineWindowsQuiesceSpecVssBackupContext")
@XmlEnum
public enum VirtualMachineWindowsQuiesceSpecVssBackupContext {
  CTX_AUTO("ctx_auto"),
  CTX_BACKUP("ctx_backup"),
  CTX_FILE_SHARE_BACKUP("ctx_file_share_backup");
  
  private final String value;
  
  VirtualMachineWindowsQuiesceSpecVssBackupContext(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineWindowsQuiesceSpecVssBackupContext fromValue(String paramString) {
    for (VirtualMachineWindowsQuiesceSpecVssBackupContext virtualMachineWindowsQuiesceSpecVssBackupContext : values()) {
      if (virtualMachineWindowsQuiesceSpecVssBackupContext.value.equals(paramString))
        return virtualMachineWindowsQuiesceSpecVssBackupContext; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
