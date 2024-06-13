package com.vmware.vim25;

import com.vmware.vim25.DatastoreVVolContainerFailoverPair;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateVVolVirtualMachineFilesRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateVVolVirtualMachineFilesRequestType", propOrder = {"_this", "failoverPair"})
public class UpdateVVolVirtualMachineFilesRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<DatastoreVVolContainerFailoverPair> failoverPair;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<DatastoreVVolContainerFailoverPair> getFailoverPair() {
    if (this.failoverPair == null)
      this.failoverPair = new ArrayList<>(); 
    return this.failoverPair;
  }
}
