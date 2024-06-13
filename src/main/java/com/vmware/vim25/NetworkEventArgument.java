package com.vmware.vim25;

import com.vmware.vim25.EntityEventArgument;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.NetworkEventArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkEventArgument", propOrder = {"network"})
public class NetworkEventArgument extends EntityEventArgument {
  @XmlElement(required = true)
  protected ManagedObjectReference network;
  
  public ManagedObjectReference getNetwork() {
    return this.network;
  }
  
  public void setNetwork(ManagedObjectReference paramManagedObjectReference) {
    this.network = paramManagedObjectReference;
  }
}
