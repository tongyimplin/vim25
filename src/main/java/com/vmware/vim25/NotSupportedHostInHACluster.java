package com.vmware.vim25;

import com.vmware.vim25.NotSupportedHost;
import com.vmware.vim25.NotSupportedHostInHACluster;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotSupportedHostInHACluster", propOrder = {"hostName", "build"})
public class NotSupportedHostInHACluster extends NotSupportedHost {
  @XmlElement(required = true)
  protected String hostName;
  
  @XmlElement(required = true)
  protected String build;
  
  public String getHostName() {
    return this.hostName;
  }
  
  public void setHostName(String paramString) {
    this.hostName = paramString;
  }
  
  public String getBuild() {
    return this.build;
  }
  
  public void setBuild(String paramString) {
    this.build = paramString;
  }
}
