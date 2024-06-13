package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualDisk;
import com.vmware.vim25.VirtualDisk;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualDisk", propOrder = {"virtualDisk"})
public class ArrayOfVirtualDisk {
  @XmlElement(name = "VirtualDisk")
  protected List<VirtualDisk> virtualDisk;
  
  public List<VirtualDisk> getVirtualDisk() {
    if (this.virtualDisk == null)
      this.virtualDisk = new ArrayList<>(); 
    return this.virtualDisk;
  }
}
