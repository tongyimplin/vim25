package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostDiskPartitionBlockRange;
import com.vmware.vim25.HostDiskPartitionBlockRange;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostDiskPartitionBlockRange", propOrder = {"hostDiskPartitionBlockRange"})
public class ArrayOfHostDiskPartitionBlockRange {
  @XmlElement(name = "HostDiskPartitionBlockRange")
  protected List<HostDiskPartitionBlockRange> hostDiskPartitionBlockRange;
  
  public List<HostDiskPartitionBlockRange> getHostDiskPartitionBlockRange() {
    if (this.hostDiskPartitionBlockRange == null)
      this.hostDiskPartitionBlockRange = new ArrayList<>(); 
    return this.hostDiskPartitionBlockRange;
  }
}
