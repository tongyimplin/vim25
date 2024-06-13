package com.vmware.vim25;

import com.vmware.vim25.DatastoreRenamedOnHostEvent;
import com.vmware.vim25.HostEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatastoreRenamedOnHostEvent", propOrder = {"oldName", "newName"})
public class DatastoreRenamedOnHostEvent extends HostEvent {
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
