package com.vmware.vim25;

import com.vmware.vim25.OvfUnsupportedPackage;
import com.vmware.vim25.OvfUnsupportedType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfUnsupportedType", propOrder = {"name", "instanceId", "deviceType"})
public class OvfUnsupportedType extends OvfUnsupportedPackage {
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected String instanceId;
  
  protected int deviceType;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
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
}
