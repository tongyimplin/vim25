package com.vmware.vim25;

import com.vmware.vim25.HostUnresolvedVmfsResolutionResult;
import com.vmware.vim25.ResolveMultipleUnresolvedVmfsVolumesResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "ResolveMultipleUnresolvedVmfsVolumesResponse")
public class ResolveMultipleUnresolvedVmfsVolumesResponse {
  protected List<HostUnresolvedVmfsResolutionResult> returnval;
  
  public List<HostUnresolvedVmfsResolutionResult> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
