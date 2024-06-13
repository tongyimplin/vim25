package com.vmware.vim25;

import com.vmware.vim25.HostConfigureVFlashResourceRequestType;
import com.vmware.vim25.HostVFlashManagerVFlashResourceConfigSpec;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostConfigureVFlashResourceRequestType", propOrder = {"_this", "spec"})
public class HostConfigureVFlashResourceRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostVFlashManagerVFlashResourceConfigSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostVFlashManagerVFlashResourceConfigSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(HostVFlashManagerVFlashResourceConfigSpec paramHostVFlashManagerVFlashResourceConfigSpec) {
    this.spec = paramHostVFlashManagerVFlashResourceConfigSpec;
  }
}
