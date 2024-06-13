package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostUnresolvedVmfsResolutionSpec;
import com.vmware.vim25.HostUnresolvedVmfsResolutionSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostUnresolvedVmfsResolutionSpec", propOrder = {"hostUnresolvedVmfsResolutionSpec"})
public class ArrayOfHostUnresolvedVmfsResolutionSpec {
  @XmlElement(name = "HostUnresolvedVmfsResolutionSpec")
  protected List<HostUnresolvedVmfsResolutionSpec> hostUnresolvedVmfsResolutionSpec;
  
  public List<HostUnresolvedVmfsResolutionSpec> getHostUnresolvedVmfsResolutionSpec() {
    if (this.hostUnresolvedVmfsResolutionSpec == null)
      this.hostUnresolvedVmfsResolutionSpec = new ArrayList<>(); 
    return this.hostUnresolvedVmfsResolutionSpec;
  }
}
