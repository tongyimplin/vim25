package com.vmware.vim25;

import com.vmware.vim25.NumericRange;
import com.vmware.vim25.VmwareDistributedVirtualSwitchTrunkVlanSpec;
import com.vmware.vim25.VmwareDistributedVirtualSwitchVlanSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmwareDistributedVirtualSwitchTrunkVlanSpec", propOrder = {"vlanId"})
public class VmwareDistributedVirtualSwitchTrunkVlanSpec extends VmwareDistributedVirtualSwitchVlanSpec {
  protected List<NumericRange> vlanId;
  
  public List<NumericRange> getVlanId() {
    if (this.vlanId == null)
      this.vlanId = new ArrayList<>(); 
    return this.vlanId;
  }
}
