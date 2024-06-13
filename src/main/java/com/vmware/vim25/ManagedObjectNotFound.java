package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectNotFound;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RuntimeFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedObjectNotFound", propOrder = {"obj"})
public class ManagedObjectNotFound extends RuntimeFault {
  @XmlElement(required = true)
  protected ManagedObjectReference obj;
  
  public ManagedObjectReference getObj() {
    return this.obj;
  }
  
  public void setObj(ManagedObjectReference paramManagedObjectReference) {
    this.obj = paramManagedObjectReference;
  }
}
