package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostServiceConfig;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostServiceConfig", propOrder = {"serviceId", "startupPolicy"})
public class HostServiceConfig extends DynamicData {
  @XmlElement(required = true)
  protected String serviceId;
  
  @XmlElement(required = true)
  protected String startupPolicy;
  
  public String getServiceId() {
    return this.serviceId;
  }
  
  public void setServiceId(String paramString) {
    this.serviceId = paramString;
  }
  
  public String getStartupPolicy() {
    return this.startupPolicy;
  }
  
  public void setStartupPolicy(String paramString) {
    this.startupPolicy = paramString;
  }
}
