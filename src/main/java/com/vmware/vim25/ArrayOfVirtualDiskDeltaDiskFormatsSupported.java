package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualDiskDeltaDiskFormatsSupported;
import com.vmware.vim25.VirtualDiskDeltaDiskFormatsSupported;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualDiskDeltaDiskFormatsSupported", propOrder = {"virtualDiskDeltaDiskFormatsSupported"})
public class ArrayOfVirtualDiskDeltaDiskFormatsSupported {
  @XmlElement(name = "VirtualDiskDeltaDiskFormatsSupported")
  protected List<VirtualDiskDeltaDiskFormatsSupported> virtualDiskDeltaDiskFormatsSupported;
  
  public List<VirtualDiskDeltaDiskFormatsSupported> getVirtualDiskDeltaDiskFormatsSupported() {
    if (this.virtualDiskDeltaDiskFormatsSupported == null)
      this.virtualDiskDeltaDiskFormatsSupported = new ArrayList<>(); 
    return this.virtualDiskDeltaDiskFormatsSupported;
  }
}
