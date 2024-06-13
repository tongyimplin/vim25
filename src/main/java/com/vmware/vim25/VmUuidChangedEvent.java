package com.vmware.vim25;

import com.vmware.vim25.VmEvent;
import com.vmware.vim25.VmUuidChangedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmUuidChangedEvent", propOrder = {"oldUuid", "newUuid"})
public class VmUuidChangedEvent extends VmEvent {
  @XmlElement(required = true)
  protected String oldUuid;
  
  @XmlElement(required = true)
  protected String newUuid;
  
  public String getOldUuid() {
    return this.oldUuid;
  }
  
  public void setOldUuid(String paramString) {
    this.oldUuid = paramString;
  }
  
  public String getNewUuid() {
    return this.newUuid;
  }
  
  public void setNewUuid(String paramString) {
    this.newUuid = paramString;
  }
}
