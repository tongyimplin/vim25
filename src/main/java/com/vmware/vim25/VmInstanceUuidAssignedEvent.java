package com.vmware.vim25;

import com.vmware.vim25.VmEvent;
import com.vmware.vim25.VmInstanceUuidAssignedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmInstanceUuidAssignedEvent", propOrder = {"instanceUuid"})
public class VmInstanceUuidAssignedEvent extends VmEvent {
  @XmlElement(required = true)
  protected String instanceUuid;
  
  public String getInstanceUuid() {
    return this.instanceUuid;
  }
  
  public void setInstanceUuid(String paramString) {
    this.instanceUuid = paramString;
  }
}
