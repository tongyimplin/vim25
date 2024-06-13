package com.vmware.vim25;

import com.vmware.vim25.FilterInUse;
import com.vmware.vim25.ResourceInUse;
import com.vmware.vim25.VirtualDiskId;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterInUse", propOrder = {"disk"})
public class FilterInUse extends ResourceInUse {
  protected List<VirtualDiskId> disk;
  
  public List<VirtualDiskId> getDisk() {
    if (this.disk == null)
      this.disk = new ArrayList<>(); 
    return this.disk;
  }
}
