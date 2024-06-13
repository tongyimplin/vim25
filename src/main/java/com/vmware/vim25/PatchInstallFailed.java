package com.vmware.vim25;

import com.vmware.vim25.PatchInstallFailed;
import com.vmware.vim25.PlatformConfigFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PatchInstallFailed", propOrder = {"rolledBack"})
public class PatchInstallFailed extends PlatformConfigFault {
  protected boolean rolledBack;
  
  public boolean isRolledBack() {
    return this.rolledBack;
  }
  
  public void setRolledBack(boolean paramBoolean) {
    this.rolledBack = paramBoolean;
  }
}
