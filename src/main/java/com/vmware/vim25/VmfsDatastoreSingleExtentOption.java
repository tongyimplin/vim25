package com.vmware.vim25;

import com.vmware.vim25.HostDiskPartitionBlockRange;
import com.vmware.vim25.VmfsDatastoreAllExtentOption;
import com.vmware.vim25.VmfsDatastoreBaseOption;
import com.vmware.vim25.VmfsDatastoreSingleExtentOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmfsDatastoreSingleExtentOption", propOrder = {"vmfsExtent"})
@XmlSeeAlso({VmfsDatastoreAllExtentOption.class})
public class VmfsDatastoreSingleExtentOption extends VmfsDatastoreBaseOption {
  @XmlElement(required = true)
  protected HostDiskPartitionBlockRange vmfsExtent;
  
  public HostDiskPartitionBlockRange getVmfsExtent() {
    return this.vmfsExtent;
  }
  
  public void setVmfsExtent(HostDiskPartitionBlockRange paramHostDiskPartitionBlockRange) {
    this.vmfsExtent = paramHostDiskPartitionBlockRange;
  }
}
