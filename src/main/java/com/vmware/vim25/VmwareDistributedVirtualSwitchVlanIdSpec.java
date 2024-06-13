package com.vmware.vim25;

import com.vmware.vim25.VmwareDistributedVirtualSwitchVlanIdSpec;
import com.vmware.vim25.VmwareDistributedVirtualSwitchVlanSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmwareDistributedVirtualSwitchVlanIdSpec", propOrder = {"vlanId"})
public class VmwareDistributedVirtualSwitchVlanIdSpec extends VmwareDistributedVirtualSwitchVlanSpec {
  protected int vlanId;
  
  public int getVlanId() {
    return this.vlanId;
  }
  
  public void setVlanId(int paramInt) {
    this.vlanId = paramInt;
  }
}
