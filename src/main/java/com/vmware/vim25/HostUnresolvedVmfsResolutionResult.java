package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostUnresolvedVmfsResolutionResult;
import com.vmware.vim25.HostUnresolvedVmfsResolutionSpec;
import com.vmware.vim25.HostVmfsVolume;
import com.vmware.vim25.LocalizedMethodFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostUnresolvedVmfsResolutionResult", propOrder = {"spec", "vmfs", "fault"})
public class HostUnresolvedVmfsResolutionResult extends DynamicData {
  @XmlElement(required = true)
  protected HostUnresolvedVmfsResolutionSpec spec;
  
  protected HostVmfsVolume vmfs;
  
  protected LocalizedMethodFault fault;
  
  public HostUnresolvedVmfsResolutionSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(HostUnresolvedVmfsResolutionSpec paramHostUnresolvedVmfsResolutionSpec) {
    this.spec = paramHostUnresolvedVmfsResolutionSpec;
  }
  
  public HostVmfsVolume getVmfs() {
    return this.vmfs;
  }
  
  public void setVmfs(HostVmfsVolume paramHostVmfsVolume) {
    this.vmfs = paramHostVmfsVolume;
  }
  
  public LocalizedMethodFault getFault() {
    return this.fault;
  }
  
  public void setFault(LocalizedMethodFault paramLocalizedMethodFault) {
    this.fault = paramLocalizedMethodFault;
  }
}
