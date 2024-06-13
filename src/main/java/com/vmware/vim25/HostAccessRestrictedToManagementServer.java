package com.vmware.vim25;

import com.vmware.vim25.HostAccessRestrictedToManagementServer;
import com.vmware.vim25.NotSupported;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostAccessRestrictedToManagementServer", propOrder = {"managementServer"})
public class HostAccessRestrictedToManagementServer extends NotSupported {
  @XmlElement(required = true)
  protected String managementServer;
  
  public String getManagementServer() {
    return this.managementServer;
  }
  
  public void setManagementServer(String paramString) {
    this.managementServer = paramString;
  }
}
