package com.vmware.vim25;

import com.vmware.vim25.OvfUnsupportedPackage;
import com.vmware.vim25.OvfUnsupportedSubType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfUnsupportedSubType", propOrder = {"elementName", "instanceId", "deviceType", "deviceSubType"})
public class OvfUnsupportedSubType extends OvfUnsupportedPackage {
  @XmlElement(required = true)
  protected String elementName;
  
  @XmlElement(required = true)
  protected String instanceId;
  
  protected int deviceType;
  
  @XmlElement(required = true)
  protected String deviceSubType;
  
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
  
  public int getDeviceType() {
    return this.deviceType;
  }
  
  public void setDeviceType(int paramInt) {
    this.deviceType = paramInt;
  }
  
  public String getDeviceSubType() {
    return this.deviceSubType;
  }
  
  public void setDeviceSubType(String paramString) {
    this.deviceSubType = paramString;
  }
}
