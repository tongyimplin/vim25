package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualSCSISharing;
import com.vmware.vim25.VirtualSCSISharing;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualSCSISharing", propOrder = {"virtualSCSISharing"})
public class ArrayOfVirtualSCSISharing {
  @XmlElement(name = "VirtualSCSISharing")
  protected List<VirtualSCSISharing> virtualSCSISharing;
  
  public List<VirtualSCSISharing> getVirtualSCSISharing() {
    if (this.virtualSCSISharing == null)
      this.virtualSCSISharing = new ArrayList<>(); 
    return this.virtualSCSISharing;
  }
}
