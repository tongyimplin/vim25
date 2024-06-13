package com.vmware.vim25;

import com.vmware.vim25.UserNotFound;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserNotFound", propOrder = {"principal", "unresolved"})
public class UserNotFound extends VimFault {
  @XmlElement(required = true)
  protected String principal;
  
  protected boolean unresolved;
  
  public String getPrincipal() {
    return this.principal;
  }
  
  public void setPrincipal(String paramString) {
    this.principal = paramString;
  }
  
  public boolean isUnresolved() {
    return this.unresolved;
  }
  
  public void setUnresolved(boolean paramBoolean) {
    this.unresolved = paramBoolean;
  }
}
