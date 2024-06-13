package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.NoAvailableIp;
import com.vmware.vim25.VAppPropertyFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoAvailableIp", propOrder = {"network"})
public class NoAvailableIp extends VAppPropertyFault {
  @XmlElement(required = true)
  protected ManagedObjectReference network;
  
  public ManagedObjectReference getNetwork() {
    return this.network;
  }
  
  public void setNetwork(ManagedObjectReference paramManagedObjectReference) {
    this.network = paramManagedObjectReference;
  }
}
