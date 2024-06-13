package com.vmware.vim25;

import com.vmware.vim25.InvalidPrivilege;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidPrivilege", propOrder = {"privilege"})
public class InvalidPrivilege extends VimFault {
  @XmlElement(required = true)
  protected String privilege;
  
  public String getPrivilege() {
    return this.privilege;
  }
  
  public void setPrivilege(String paramString) {
    this.privilege = paramString;
  }
}
