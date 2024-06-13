package com.vmware.vim25;

import com.vmware.vim25.CustomFieldDefEvent;
import com.vmware.vim25.CustomFieldDefRenamedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomFieldDefRenamedEvent", propOrder = {"newName"})
public class CustomFieldDefRenamedEvent extends CustomFieldDefEvent {
  @XmlElement(required = true)
  protected String newName;
  
  public String getNewName() {
    return this.newName;
  }
  
  public void setNewName(String paramString) {
    this.newName = paramString;
  }
}
