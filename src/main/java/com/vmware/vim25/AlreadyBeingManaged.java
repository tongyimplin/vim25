package com.vmware.vim25;

import com.vmware.vim25.AlreadyBeingManaged;
import com.vmware.vim25.HostConnectFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlreadyBeingManaged", propOrder = {"ipAddress"})
public class AlreadyBeingManaged extends HostConnectFault {
  @XmlElement(required = true)
  protected String ipAddress;
  
  public String getIpAddress() {
    return this.ipAddress;
  }
  
  public void setIpAddress(String paramString) {
    this.ipAddress = paramString;
  }
}
