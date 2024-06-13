package com.vmware.vim25;

import com.vmware.vim25.HostConfigVFlashCacheRequestType;
import com.vmware.vim25.HostVFlashManagerVFlashCacheConfigSpec;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostConfigVFlashCacheRequestType", propOrder = {"_this", "spec"})
public class HostConfigVFlashCacheRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostVFlashManagerVFlashCacheConfigSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostVFlashManagerVFlashCacheConfigSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(HostVFlashManagerVFlashCacheConfigSpec paramHostVFlashManagerVFlashCacheConfigSpec) {
    this.spec = paramHostVFlashManagerVFlashCacheConfigSpec;
  }
}
