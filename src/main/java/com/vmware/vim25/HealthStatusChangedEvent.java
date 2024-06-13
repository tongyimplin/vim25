package com.vmware.vim25;

import com.vmware.vim25.Event;
import com.vmware.vim25.HealthStatusChangedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HealthStatusChangedEvent", propOrder = {"componentId", "oldStatus", "newStatus", "componentName", "serviceId"})
public class HealthStatusChangedEvent extends Event {
  @XmlElement(required = true)
  protected String componentId;
  
  @XmlElement(required = true)
  protected String oldStatus;
  
  @XmlElement(required = true)
  protected String newStatus;
  
  @XmlElement(required = true)
  protected String componentName;
  
  protected String serviceId;
  
  public String getComponentId() {
    return this.componentId;
  }
  
  public void setComponentId(String paramString) {
    this.componentId = paramString;
  }
  
  public String getOldStatus() {
    return this.oldStatus;
  }
  
  public void setOldStatus(String paramString) {
    this.oldStatus = paramString;
  }
  
  public String getNewStatus() {
    return this.newStatus;
  }
  
  public void setNewStatus(String paramString) {
    this.newStatus = paramString;
  }
  
  public String getComponentName() {
    return this.componentName;
  }
  
  public void setComponentName(String paramString) {
    this.componentName = paramString;
  }
  
  public String getServiceId() {
    return this.serviceId;
  }
  
  public void setServiceId(String paramString) {
    this.serviceId = paramString;
  }
}
