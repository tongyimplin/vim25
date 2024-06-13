package com.vmware.vim25;

import com.vmware.vim25.HostHasComponentFailure;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostHasComponentFailure", propOrder = {"hostName", "componentType", "componentName"})
public class HostHasComponentFailure extends VimFault {
  @XmlElement(required = true)
  protected String hostName;
  
  @XmlElement(required = true)
  protected String componentType;
  
  @XmlElement(required = true)
  protected String componentName;
  
  public String getHostName() {
    return this.hostName;
  }
  
  public void setHostName(String paramString) {
    this.hostName = paramString;
  }
  
  public String getComponentType() {
    return this.componentType;
  }
  
  public void setComponentType(String paramString) {
    this.componentType = paramString;
  }
  
  public String getComponentName() {
    return this.componentName;
  }
  
  public void setComponentName(String paramString) {
    this.componentName = paramString;
  }
}
