package com.vmware.vim25;

import com.vmware.vim25.InheritablePolicy;
import com.vmware.vim25.VMwareUplinkPortOrderPolicy;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareUplinkPortOrderPolicy", propOrder = {"activeUplinkPort", "standbyUplinkPort"})
public class VMwareUplinkPortOrderPolicy extends InheritablePolicy {
  protected List<String> activeUplinkPort;
  
  protected List<String> standbyUplinkPort;
  
  public List<String> getActiveUplinkPort() {
    if (this.activeUplinkPort == null)
      this.activeUplinkPort = new ArrayList<>(); 
    return this.activeUplinkPort;
  }
  
  public List<String> getStandbyUplinkPort() {
    if (this.standbyUplinkPort == null)
      this.standbyUplinkPort = new ArrayList<>(); 
    return this.standbyUplinkPort;
  }
}
