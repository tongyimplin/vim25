package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostAssignableHardwareConfigAttributeOverride;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostAssignableHardwareConfigAttributeOverride", propOrder = {"instanceId", "name", "value"})
public class HostAssignableHardwareConfigAttributeOverride extends DynamicData {
  @XmlElement(required = true)
  protected String instanceId;
  
  @XmlElement(required = true)
  protected String name;
  
  protected Object value;
  
  public String getInstanceId() {
    return this.instanceId;
  }
  
  public void setInstanceId(String paramString) {
    this.instanceId = paramString;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public Object getValue() {
    return this.value;
  }
  
  public void setValue(Object paramObject) {
    this.value = paramObject;
  }
}
