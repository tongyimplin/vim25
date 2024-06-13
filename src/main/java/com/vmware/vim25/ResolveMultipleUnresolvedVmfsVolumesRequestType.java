package com.vmware.vim25;

import com.vmware.vim25.HostUnresolvedVmfsResolutionSpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ResolveMultipleUnresolvedVmfsVolumesRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResolveMultipleUnresolvedVmfsVolumesRequestType", propOrder = {"_this", "resolutionSpec"})
public class ResolveMultipleUnresolvedVmfsVolumesRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected List<HostUnresolvedVmfsResolutionSpec> resolutionSpec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<HostUnresolvedVmfsResolutionSpec> getResolutionSpec() {
    if (this.resolutionSpec == null)
      this.resolutionSpec = new ArrayList<>(); 
    return this.resolutionSpec;
  }
}
