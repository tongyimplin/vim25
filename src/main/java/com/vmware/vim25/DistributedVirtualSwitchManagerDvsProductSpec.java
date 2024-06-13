package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchManagerDvsProductSpec;
import com.vmware.vim25.DistributedVirtualSwitchProductSpec;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualSwitchManagerDvsProductSpec", propOrder = {"newSwitchProductSpec", "distributedVirtualSwitch"})
public class DistributedVirtualSwitchManagerDvsProductSpec extends DynamicData {
  protected DistributedVirtualSwitchProductSpec newSwitchProductSpec;
  
  protected ManagedObjectReference distributedVirtualSwitch;
  
  public DistributedVirtualSwitchProductSpec getNewSwitchProductSpec() {
    return this.newSwitchProductSpec;
  }
  
  public void setNewSwitchProductSpec(DistributedVirtualSwitchProductSpec paramDistributedVirtualSwitchProductSpec) {
    this.newSwitchProductSpec = paramDistributedVirtualSwitchProductSpec;
  }
  
  public ManagedObjectReference getDistributedVirtualSwitch() {
    return this.distributedVirtualSwitch;
  }
  
  public void setDistributedVirtualSwitch(ManagedObjectReference paramManagedObjectReference) {
    this.distributedVirtualSwitch = paramManagedObjectReference;
  }
}
