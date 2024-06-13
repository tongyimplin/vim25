package com.vmware.vim25;

import com.vmware.vim25.ServiceLocatorCredential;
import com.vmware.vim25.ServiceLocatorNamePassword;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceLocatorNamePassword", propOrder = {"username", "password"})
public class ServiceLocatorNamePassword extends ServiceLocatorCredential {
  @XmlElement(required = true)
  protected String username;
  
  @XmlElement(required = true)
  protected String password;
  
  public String getUsername() {
    return this.username;
  }
  
  public void setUsername(String paramString) {
    this.username = paramString;
  }
  
  public String getPassword() {
    return this.password;
  }
  
  public void setPassword(String paramString) {
    this.password = paramString;
  }
}
