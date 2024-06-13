package com.vmware.vim25;

import com.vmware.vim25.NotSupportedHost;
import com.vmware.vim25.NotSupportedHostForVmemFile;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotSupportedHostForVmemFile", propOrder = {"hostName"})
public class NotSupportedHostForVmemFile extends NotSupportedHost {
  @XmlElement(required = true)
  protected String hostName;
  
  public String getHostName() {
    return this.hostName;
  }
  
  public void setHostName(String paramString) {
    this.hostName = paramString;
  }
}
