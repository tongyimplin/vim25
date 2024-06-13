package com.vmware.vim25;

import com.vmware.vim25.ExtendVirtualDiskTaskResponse;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "ExtendVirtualDisk_TaskResponse")
public class ExtendVirtualDiskTaskResponse {
  @XmlElement(required = true)
  protected ManagedObjectReference returnval;
  
  public ManagedObjectReference getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(ManagedObjectReference paramManagedObjectReference) {
    this.returnval = paramManagedObjectReference;
  }
}
