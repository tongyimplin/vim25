package com.vmware.vim25;

import com.vmware.vim25.ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots", propOrder = {"host", "slots"})
public class ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  protected int slots;
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public int getSlots() {
    return this.slots;
  }
  
  public void setSlots(int paramInt) {
    this.slots = paramInt;
  }
}
