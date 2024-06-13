package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostUnresolvedVmfsExtent;
import com.vmware.vim25.HostUnresolvedVmfsExtent;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostUnresolvedVmfsExtent", propOrder = {"hostUnresolvedVmfsExtent"})
public class ArrayOfHostUnresolvedVmfsExtent {
  @XmlElement(name = "HostUnresolvedVmfsExtent")
  protected List<HostUnresolvedVmfsExtent> hostUnresolvedVmfsExtent;
  
  public List<HostUnresolvedVmfsExtent> getHostUnresolvedVmfsExtent() {
    if (this.hostUnresolvedVmfsExtent == null)
      this.hostUnresolvedVmfsExtent = new ArrayList<>(); 
    return this.hostUnresolvedVmfsExtent;
  }
}
