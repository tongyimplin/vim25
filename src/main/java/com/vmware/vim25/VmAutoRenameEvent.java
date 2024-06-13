package com.vmware.vim25;

import com.vmware.vim25.VmAutoRenameEvent;
import com.vmware.vim25.VmEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmAutoRenameEvent", propOrder = {"oldName", "newName"})
public class VmAutoRenameEvent extends VmEvent {
  @XmlElement(required = true)
  protected String oldName;
  
  @XmlElement(required = true)
  protected String newName;
  
  public String getOldName() {
    return this.oldName;
  }
  
  public void setOldName(String paramString) {
    this.oldName = paramString;
  }
  
  public String getNewName() {
    return this.newName;
  }
  
  public void setNewName(String paramString) {
    this.newName = paramString;
  }
}
