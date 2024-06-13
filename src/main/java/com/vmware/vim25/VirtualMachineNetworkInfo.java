package com.vmware.vim25;

import com.vmware.vim25.NetworkSummary;
import com.vmware.vim25.VirtualMachineNetworkInfo;
import com.vmware.vim25.VirtualMachineTargetInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineNetworkInfo", propOrder = {"network", "vswitch"})
public class VirtualMachineNetworkInfo extends VirtualMachineTargetInfo {
  @XmlElement(required = true)
  protected NetworkSummary network;
  
  protected String vswitch;
  
  public NetworkSummary getNetwork() {
    return this.network;
  }
  
  public void setNetwork(NetworkSummary paramNetworkSummary) {
    this.network = paramNetworkSummary;
  }
  
  public String getVswitch() {
    return this.vswitch;
  }
  
  public void setVswitch(String paramString) {
    this.vswitch = paramString;
  }
}
