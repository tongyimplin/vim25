package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualDiskId;
import com.vmware.vim25.VirtualDiskId;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualDiskId", propOrder = {"virtualDiskId"})
public class ArrayOfVirtualDiskId {
  @XmlElement(name = "VirtualDiskId")
  protected List<VirtualDiskId> virtualDiskId;
  
  public List<VirtualDiskId> getVirtualDiskId() {
    if (this.virtualDiskId == null)
      this.virtualDiskId = new ArrayList<>(); 
    return this.virtualDiskId;
  }
}
