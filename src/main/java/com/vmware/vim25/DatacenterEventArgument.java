package com.vmware.vim25;

import com.vmware.vim25.DatacenterEventArgument;
import com.vmware.vim25.EntityEventArgument;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatacenterEventArgument", propOrder = {"datacenter"})
public class DatacenterEventArgument extends EntityEventArgument {
  @XmlElement(required = true)
  protected ManagedObjectReference datacenter;
  
  public ManagedObjectReference getDatacenter() {
    return this.datacenter;
  }
  
  public void setDatacenter(ManagedObjectReference paramManagedObjectReference) {
    this.datacenter = paramManagedObjectReference;
  }
}
