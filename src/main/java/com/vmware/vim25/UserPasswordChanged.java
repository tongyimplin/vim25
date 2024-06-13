package com.vmware.vim25;

import com.vmware.vim25.HostEvent;
import com.vmware.vim25.UserPasswordChanged;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserPasswordChanged", propOrder = {"userLogin"})
public class UserPasswordChanged extends HostEvent {
  @XmlElement(required = true)
  protected String userLogin;
  
  public String getUserLogin() {
    return this.userLogin;
  }
  
  public void setUserLogin(String paramString) {
    this.userLogin = paramString;
  }
}
