package com.vmware.vim25;

import com.vmware.vim25.NetworkDisruptedAndConfigRolledBack;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkDisruptedAndConfigRolledBack", propOrder = {"host"})
public class NetworkDisruptedAndConfigRolledBack extends VimFault {
  @XmlElement(required = true)
  protected String host;
  
  public String getHost() {
    return this.host;
  }
  
  public void setHost(String paramString) {
    this.host = paramString;
  }
}
