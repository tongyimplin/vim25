package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostUnresolvedVmfsVolume;
import com.vmware.vim25.HostUnresolvedVmfsVolume;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostUnresolvedVmfsVolume", propOrder = {"hostUnresolvedVmfsVolume"})
public class ArrayOfHostUnresolvedVmfsVolume {
  @XmlElement(name = "HostUnresolvedVmfsVolume")
  protected List<HostUnresolvedVmfsVolume> hostUnresolvedVmfsVolume;
  
  public List<HostUnresolvedVmfsVolume> getHostUnresolvedVmfsVolume() {
    if (this.hostUnresolvedVmfsVolume == null)
      this.hostUnresolvedVmfsVolume = new ArrayList<>(); 
    return this.hostUnresolvedVmfsVolume;
  }
}
