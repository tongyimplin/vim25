package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostVirtualSwitchConfig;
import com.vmware.vim25.HostVirtualSwitchSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVirtualSwitchConfig", propOrder = {"changeOperation", "name", "spec"})
public class HostVirtualSwitchConfig extends DynamicData {
  protected String changeOperation;
  
  @XmlElement(required = true)
  protected String name;
  
  protected HostVirtualSwitchSpec spec;
  
  public String getChangeOperation() {
    return this.changeOperation;
  }
  
  public void setChangeOperation(String paramString) {
    this.changeOperation = paramString;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public HostVirtualSwitchSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(HostVirtualSwitchSpec paramHostVirtualSwitchSpec) {
    this.spec = paramHostVirtualSwitchSpec;
  }
}
