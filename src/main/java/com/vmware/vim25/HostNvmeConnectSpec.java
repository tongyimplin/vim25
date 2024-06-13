package com.vmware.vim25;

import com.vmware.vim25.HostNvmeConnectSpec;
import com.vmware.vim25.HostNvmeSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNvmeConnectSpec", propOrder = {"subnqn", "controllerId", "adminQueueSize", "keepAliveTimeout"})
public class HostNvmeConnectSpec extends HostNvmeSpec {
  @XmlElement(required = true)
  protected String subnqn;
  
  protected Integer controllerId;
  
  protected Integer adminQueueSize;
  
  protected Integer keepAliveTimeout;
  
  public String getSubnqn() {
    return this.subnqn;
  }
  
  public void setSubnqn(String paramString) {
    this.subnqn = paramString;
  }
  
  public Integer getControllerId() {
    return this.controllerId;
  }
  
  public void setControllerId(Integer paramInteger) {
    this.controllerId = paramInteger;
  }
  
  public Integer getAdminQueueSize() {
    return this.adminQueueSize;
  }
  
  public void setAdminQueueSize(Integer paramInteger) {
    this.adminQueueSize = paramInteger;
  }
  
  public Integer getKeepAliveTimeout() {
    return this.keepAliveTimeout;
  }
  
  public void setKeepAliveTimeout(Integer paramInteger) {
    this.keepAliveTimeout = paramInteger;
  }
}
