package com.vmware.vim25;

import com.vmware.vim25.HostUnresolvedVmfsResignatureSpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ResignatureUnresolvedVmfsVolumeRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResignatureUnresolvedVmfsVolumeRequestType", propOrder = {"_this", "resolutionSpec"})
public class ResignatureUnresolvedVmfsVolumeRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostUnresolvedVmfsResignatureSpec resolutionSpec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostUnresolvedVmfsResignatureSpec getResolutionSpec() {
    return this.resolutionSpec;
  }
  
  public void setResolutionSpec(HostUnresolvedVmfsResignatureSpec paramHostUnresolvedVmfsResignatureSpec) {
    this.resolutionSpec = paramHostUnresolvedVmfsResignatureSpec;
  }
}
