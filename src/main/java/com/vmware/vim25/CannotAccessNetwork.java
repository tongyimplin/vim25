package com.vmware.vim25;

import com.vmware.vim25.CannotAccessNetwork;
import com.vmware.vim25.CannotAccessVmDevice;
import com.vmware.vim25.DestinationSwitchFull;
import com.vmware.vim25.LegacyNetworkInterfaceInUse;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VMOnConflictDVPort;
import com.vmware.vim25.VMOnVirtualIntranet;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CannotAccessNetwork", propOrder = {"network"})
@XmlSeeAlso({VMOnConflictDVPort.class, LegacyNetworkInterfaceInUse.class, VMOnVirtualIntranet.class, DestinationSwitchFull.class})
public class CannotAccessNetwork extends CannotAccessVmDevice {
  protected ManagedObjectReference network;
  
  public ManagedObjectReference getNetwork() {
    return this.network;
  }
  
  public void setNetwork(ManagedObjectReference paramManagedObjectReference) {
    this.network = paramManagedObjectReference;
  }
}
