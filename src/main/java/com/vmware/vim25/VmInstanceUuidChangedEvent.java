package com.vmware.vim25;

import com.vmware.vim25.VmEvent;
import com.vmware.vim25.VmInstanceUuidChangedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmInstanceUuidChangedEvent", propOrder = {"oldInstanceUuid", "newInstanceUuid"})
public class VmInstanceUuidChangedEvent extends VmEvent {
  @XmlElement(required = true)
  protected String oldInstanceUuid;
  
  @XmlElement(required = true)
  protected String newInstanceUuid;
  
  public String getOldInstanceUuid() {
    return this.oldInstanceUuid;
  }
  
  public void setOldInstanceUuid(String paramString) {
    this.oldInstanceUuid = paramString;
  }
  
  public String getNewInstanceUuid() {
    return this.newInstanceUuid;
  }
  
  public void setNewInstanceUuid(String paramString) {
    this.newInstanceUuid = paramString;
  }
}
