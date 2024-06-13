package com.vmware.vim25;

import com.vmware.vim25.DvsEventArgument;
import com.vmware.vim25.EntityEventArgument;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsEventArgument", propOrder = {"dvs"})
public class DvsEventArgument extends EntityEventArgument {
  @XmlElement(required = true)
  protected ManagedObjectReference dvs;
  
  public ManagedObjectReference getDvs() {
    return this.dvs;
  }
  
  public void setDvs(ManagedObjectReference paramManagedObjectReference) {
    this.dvs = paramManagedObjectReference;
  }
}
