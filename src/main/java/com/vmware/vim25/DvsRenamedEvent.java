package com.vmware.vim25;

import com.vmware.vim25.DvsEvent;
import com.vmware.vim25.DvsRenamedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsRenamedEvent", propOrder = {"oldName", "newName"})
public class DvsRenamedEvent extends DvsEvent {
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
