package com.vmware.vim25;

import com.vmware.vim25.HostDiskPartitionBlockRange;
import com.vmware.vim25.VmfsDatastoreBaseOption;
import com.vmware.vim25.VmfsDatastoreMultipleExtentOption;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmfsDatastoreMultipleExtentOption", propOrder = {"vmfsExtent"})
public class VmfsDatastoreMultipleExtentOption extends VmfsDatastoreBaseOption {
  @XmlElement(required = true)
  protected List<HostDiskPartitionBlockRange> vmfsExtent;
  
  public List<HostDiskPartitionBlockRange> getVmfsExtent() {
    if (this.vmfsExtent == null)
      this.vmfsExtent = new ArrayList<>(); 
    return this.vmfsExtent;
  }
}
