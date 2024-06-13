package com.vmware.vim25;

import com.vmware.vim25.VmwareDistributedVirtualSwitchPvlanSpec;
import com.vmware.vim25.VmwareDistributedVirtualSwitchVlanSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmwareDistributedVirtualSwitchPvlanSpec", propOrder = {"pvlanId"})
public class VmwareDistributedVirtualSwitchPvlanSpec extends VmwareDistributedVirtualSwitchVlanSpec {
  protected int pvlanId;
  
  public int getPvlanId() {
    return this.pvlanId;
  }
  
  public void setPvlanId(int paramInt) {
    this.pvlanId = paramInt;
  }
}
