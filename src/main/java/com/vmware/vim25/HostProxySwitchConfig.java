package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostProxySwitchConfig;
import com.vmware.vim25.HostProxySwitchSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostProxySwitchConfig", propOrder = {"changeOperation", "uuid", "spec"})
public class HostProxySwitchConfig extends DynamicData {
  protected String changeOperation;
  
  @XmlElement(required = true)
  protected String uuid;
  
  protected HostProxySwitchSpec spec;
  
  public String getChangeOperation() {
    return this.changeOperation;
  }
  
  public void setChangeOperation(String paramString) {
    this.changeOperation = paramString;
  }
  
  public String getUuid() {
    return this.uuid;
  }
  
  public void setUuid(String paramString) {
    this.uuid = paramString;
  }
  
  public HostProxySwitchSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(HostProxySwitchSpec paramHostProxySwitchSpec) {
    this.spec = paramHostProxySwitchSpec;
  }
}
