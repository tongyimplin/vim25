package com.vmware.vim25;

import com.vmware.vim25.InvalidNasCredentials;
import com.vmware.vim25.NasConfigFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidNasCredentials", propOrder = {"userName"})
public class InvalidNasCredentials extends NasConfigFault {
  @XmlElement(required = true)
  protected String userName;
  
  public String getUserName() {
    return this.userName;
  }
  
  public void setUserName(String paramString) {
    this.userName = paramString;
  }
}
