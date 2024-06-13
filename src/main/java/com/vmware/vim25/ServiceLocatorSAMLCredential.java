package com.vmware.vim25;

import com.vmware.vim25.ServiceLocatorCredential;
import com.vmware.vim25.ServiceLocatorSAMLCredential;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceLocatorSAMLCredential", propOrder = {"token"})
public class ServiceLocatorSAMLCredential extends ServiceLocatorCredential {
  protected String token;
  
  public String getToken() {
    return this.token;
  }
  
  public void setToken(String paramString) {
    this.token = paramString;
  }
}
