package com.vmware.vim25;

import com.vmware.vim25.CustomizationFault;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.MountError;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MountError", propOrder = {"vm", "diskIndex"})
public class MountError extends CustomizationFault {
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  protected int diskIndex;
  
  public ManagedObjectReference getVm() {
    return this.vm;
  }
  
  public void setVm(ManagedObjectReference paramManagedObjectReference) {
    this.vm = paramManagedObjectReference;
  }
  
  public int getDiskIndex() {
    return this.diskIndex;
  }
  
  public void setDiskIndex(int paramInt) {
    this.diskIndex = paramInt;
  }
}
