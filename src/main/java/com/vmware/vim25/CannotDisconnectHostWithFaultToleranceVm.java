package com.vmware.vim25;

import com.vmware.vim25.CannotDisconnectHostWithFaultToleranceVm;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CannotDisconnectHostWithFaultToleranceVm", propOrder = {"hostName"})
public class CannotDisconnectHostWithFaultToleranceVm extends VimFault {
  @XmlElement(required = true)
  protected String hostName;
  
  public String getHostName() {
    return this.hostName;
  }
  
  public void setHostName(String paramString) {
    this.hostName = paramString;
  }
}
