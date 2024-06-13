package com.vmware.vim25;

import com.vmware.vim25.OpaqueNetworkSummary;
import com.vmware.vim25.OpaqueNetworkTargetInfo;
import com.vmware.vim25.VirtualMachineTargetInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpaqueNetworkTargetInfo", propOrder = {"network", "networkReservationSupported"})
public class OpaqueNetworkTargetInfo extends VirtualMachineTargetInfo {
  @XmlElement(required = true)
  protected OpaqueNetworkSummary network;
  
  protected Boolean networkReservationSupported;
  
  public OpaqueNetworkSummary getNetwork() {
    return this.network;
  }
  
  public void setNetwork(OpaqueNetworkSummary paramOpaqueNetworkSummary) {
    this.network = paramOpaqueNetworkSummary;
  }
  
  public Boolean isNetworkReservationSupported() {
    return this.networkReservationSupported;
  }
  
  public void setNetworkReservationSupported(Boolean paramBoolean) {
    this.networkReservationSupported = paramBoolean;
  }
}
