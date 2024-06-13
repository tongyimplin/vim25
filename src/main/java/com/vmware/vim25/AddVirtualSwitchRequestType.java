package com.vmware.vim25;

import com.vmware.vim25.AddVirtualSwitchRequestType;
import com.vmware.vim25.HostVirtualSwitchSpec;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddVirtualSwitchRequestType", propOrder = {"_this", "vswitchName", "spec"})
public class AddVirtualSwitchRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String vswitchName;
  
  protected HostVirtualSwitchSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getVswitchName() {
    return this.vswitchName;
  }
  
  public void setVswitchName(String paramString) {
    this.vswitchName = paramString;
  }
  
  public HostVirtualSwitchSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(HostVirtualSwitchSpec paramHostVirtualSwitchSpec) {
    this.spec = paramHostVirtualSwitchSpec;
  }
}
