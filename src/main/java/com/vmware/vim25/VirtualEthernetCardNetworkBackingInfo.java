package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VirtualDeviceDeviceBackingInfo;
import com.vmware.vim25.VirtualEthernetCardNetworkBackingInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualEthernetCardNetworkBackingInfo", propOrder = {"network", "inPassthroughMode"})
public class VirtualEthernetCardNetworkBackingInfo extends VirtualDeviceDeviceBackingInfo {
  protected ManagedObjectReference network;
  
  protected Boolean inPassthroughMode;
  
  public ManagedObjectReference getNetwork() {
    return this.network;
  }
  
  public void setNetwork(ManagedObjectReference paramManagedObjectReference) {
    this.network = paramManagedObjectReference;
  }
  
  public Boolean isInPassthroughMode() {
    return this.inPassthroughMode;
  }
  
  public void setInPassthroughMode(Boolean paramBoolean) {
    this.inPassthroughMode = paramBoolean;
  }
}
