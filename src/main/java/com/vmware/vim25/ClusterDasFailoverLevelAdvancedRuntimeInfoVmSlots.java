package com.vmware.vim25;

import com.vmware.vim25.ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots", propOrder = {"vm", "slots"})
public class ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  protected int slots;
  
  public ManagedObjectReference getVm() {
    return this.vm;
  }
  
  public void setVm(ManagedObjectReference paramManagedObjectReference) {
    this.vm = paramManagedObjectReference;
  }
  
  public int getSlots() {
    return this.slots;
  }
  
  public void setSlots(int paramInt) {
    this.slots = paramInt;
  }
}
