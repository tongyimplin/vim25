package com.vmware.vim25;

import com.vmware.vim25.EntityEventArgument;
import com.vmware.vim25.HostEventArgument;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostEventArgument", propOrder = {"host"})
public class HostEventArgument extends EntityEventArgument {
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
}
