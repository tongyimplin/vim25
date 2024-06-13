package com.vmware.vim25;

import com.vmware.vim25.DatastoreEvent;
import com.vmware.vim25.DatastoreRenamedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatastoreRenamedEvent", propOrder = {"oldName", "newName"})
public class DatastoreRenamedEvent extends DatastoreEvent {
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
