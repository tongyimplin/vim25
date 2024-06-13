package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VirtualDiskId;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskId", propOrder = {"vm", "diskId"})
public class VirtualDiskId extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  protected int diskId;
  
  public ManagedObjectReference getVm() {
    return this.vm;
  }
  
  public void setVm(ManagedObjectReference paramManagedObjectReference) {
    this.vm = paramManagedObjectReference;
  }
  
  public int getDiskId() {
    return this.diskId;
  }
  
  public void setDiskId(int paramInt) {
    this.diskId = paramInt;
  }
}
