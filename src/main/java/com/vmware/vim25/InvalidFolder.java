package com.vmware.vim25;

import com.vmware.vim25.InvalidFolder;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VimFault;
import com.vmware.vim25.VmAlreadyExistsInDatacenter;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidFolder", propOrder = {"target"})
@XmlSeeAlso({VmAlreadyExistsInDatacenter.class})
public class InvalidFolder extends VimFault {
  @XmlElement(required = true)
  protected ManagedObjectReference target;
  
  public ManagedObjectReference getTarget() {
    return this.target;
  }
  
  public void setTarget(ManagedObjectReference paramManagedObjectReference) {
    this.target = paramManagedObjectReference;
  }
}
