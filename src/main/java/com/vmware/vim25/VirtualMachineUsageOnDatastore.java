package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VirtualMachineUsageOnDatastore;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineUsageOnDatastore", propOrder = {"datastore", "committed", "uncommitted", "unshared"})
public class VirtualMachineUsageOnDatastore extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference datastore;
  
  protected long committed;
  
  protected long uncommitted;
  
  protected long unshared;
  
  public ManagedObjectReference getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(ManagedObjectReference paramManagedObjectReference) {
    this.datastore = paramManagedObjectReference;
  }
  
  public long getCommitted() {
    return this.committed;
  }
  
  public void setCommitted(long paramLong) {
    this.committed = paramLong;
  }
  
  public long getUncommitted() {
    return this.uncommitted;
  }
  
  public void setUncommitted(long paramLong) {
    this.uncommitted = paramLong;
  }
  
  public long getUnshared() {
    return this.unshared;
  }
  
  public void setUnshared(long paramLong) {
    this.unshared = paramLong;
  }
}
