package com.vmware.vim25;

import com.vmware.vim25.DVSHealthCheckCapability;
import com.vmware.vim25.VMwareDVSHealthCheckCapability;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDVSHealthCheckCapability", propOrder = {"vlanMtuSupported", "teamingSupported"})
public class VMwareDVSHealthCheckCapability extends DVSHealthCheckCapability {
  protected boolean vlanMtuSupported;
  
  protected boolean teamingSupported;
  
  public boolean isVlanMtuSupported() {
    return this.vlanMtuSupported;
  }
  
  public void setVlanMtuSupported(boolean paramBoolean) {
    this.vlanMtuSupported = paramBoolean;
  }
  
  public boolean isTeamingSupported() {
    return this.teamingSupported;
  }
  
  public void setTeamingSupported(boolean paramBoolean) {
    this.teamingSupported = paramBoolean;
  }
}
