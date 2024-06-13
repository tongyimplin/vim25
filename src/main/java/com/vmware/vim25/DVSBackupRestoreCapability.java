package com.vmware.vim25;

import com.vmware.vim25.DVSBackupRestoreCapability;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSBackupRestoreCapability", propOrder = {"backupRestoreSupported"})
public class DVSBackupRestoreCapability extends DynamicData {
  protected boolean backupRestoreSupported;
  
  public boolean isBackupRestoreSupported() {
    return this.backupRestoreSupported;
  }
  
  public void setBackupRestoreSupported(boolean paramBoolean) {
    this.backupRestoreSupported = paramBoolean;
  }
}
