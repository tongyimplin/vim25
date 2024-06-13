package com.vmware.vim25;

import com.vmware.vim25.VmEvent;
import com.vmware.vim25.VmUuidAssignedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmUuidAssignedEvent", propOrder = {"uuid"})
public class VmUuidAssignedEvent extends VmEvent {
  @XmlElement(required = true)
  protected String uuid;
  
  public String getUuid() {
    return this.uuid;
  }
  
  public void setUuid(String paramString) {
    this.uuid = paramString;
  }
}
