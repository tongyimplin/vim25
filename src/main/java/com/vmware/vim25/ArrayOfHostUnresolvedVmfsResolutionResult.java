package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostUnresolvedVmfsResolutionResult;
import com.vmware.vim25.HostUnresolvedVmfsResolutionResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostUnresolvedVmfsResolutionResult", propOrder = {"hostUnresolvedVmfsResolutionResult"})
public class ArrayOfHostUnresolvedVmfsResolutionResult {
  @XmlElement(name = "HostUnresolvedVmfsResolutionResult")
  protected List<HostUnresolvedVmfsResolutionResult> hostUnresolvedVmfsResolutionResult;
  
  public List<HostUnresolvedVmfsResolutionResult> getHostUnresolvedVmfsResolutionResult() {
    if (this.hostUnresolvedVmfsResolutionResult == null)
      this.hostUnresolvedVmfsResolutionResult = new ArrayList<>(); 
    return this.hostUnresolvedVmfsResolutionResult;
  }
}
