package com.vmware.vim25;

import com.vmware.vim25.GuestAuthentication;
import com.vmware.vim25.SAMLTokenAuthentication;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SAMLTokenAuthentication", propOrder = {"token", "username"})
public class SAMLTokenAuthentication extends GuestAuthentication {
  @XmlElement(required = true)
  protected String token;
  
  protected String username;
  
  public String getToken() {
    return this.token;
  }
  
  public void setToken(String paramString) {
    this.token = paramString;
  }
  
  public String getUsername() {
    return this.username;
  }
  
  public void setUsername(String paramString) {
    this.username = paramString;
  }
}
