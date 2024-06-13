package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.PhysicalNicConfig;
import com.vmware.vim25.PhysicalNicSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalNicConfig", propOrder = {"device", "spec"})
public class PhysicalNicConfig extends DynamicData {
  @XmlElement(required = true)
  protected String device;
  
  @XmlElement(required = true)
  protected PhysicalNicSpec spec;
  
  public String getDevice() {
    return this.device;
  }
  
  public void setDevice(String paramString) {
    this.device = paramString;
  }
  
  public PhysicalNicSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(PhysicalNicSpec paramPhysicalNicSpec) {
    this.spec = paramPhysicalNicSpec;
  }
}
