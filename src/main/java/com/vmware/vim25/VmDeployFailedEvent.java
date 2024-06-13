package com.vmware.vim25;

import com.vmware.vim25.EntityEventArgument;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.VmDeployFailedEvent;
import com.vmware.vim25.VmEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmDeployFailedEvent", propOrder = {"destDatastore", "reason"})
public class VmDeployFailedEvent extends VmEvent {
  @XmlElement(required = true)
  protected EntityEventArgument destDatastore;
  
  @XmlElement(required = true)
  protected LocalizedMethodFault reason;
  
  public EntityEventArgument getDestDatastore() {
    return this.destDatastore;
  }
  
  public void setDestDatastore(EntityEventArgument paramEntityEventArgument) {
    this.destDatastore = paramEntityEventArgument;
  }
  
  public LocalizedMethodFault getReason() {
    return this.reason;
  }
  
  public void setReason(LocalizedMethodFault paramLocalizedMethodFault) {
    this.reason = paramLocalizedMethodFault;
  }
}
