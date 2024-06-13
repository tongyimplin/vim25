package com.vmware.vim25;

import com.vmware.vim25.OvfSystemFault;
import com.vmware.vim25.OvfUnsupportedDeviceBackingOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfUnsupportedDeviceBackingOption", propOrder = {"elementName", "instanceId", "deviceName", "backingName"})
public class OvfUnsupportedDeviceBackingOption extends OvfSystemFault {
  protected String elementName;
  
  protected String instanceId;
  
  @XmlElement(required = true)
  protected String deviceName;
  
  protected String backingName;
  
  public String getElementName() {
    return this.elementName;
  }
  
  public void setElementName(String paramString) {
    this.elementName = paramString;
  }
  
  public String getInstanceId() {
    return this.instanceId;
  }
  
  public void setInstanceId(String paramString) {
    this.instanceId = paramString;
  }
  
  public String getDeviceName() {
    return this.deviceName;
  }
  
  public void setDeviceName(String paramString) {
    this.deviceName = paramString;
  }
  
  public String getBackingName() {
    return this.backingName;
  }
  
  public void setBackingName(String paramString) {
    this.backingName = paramString;
  }
}
