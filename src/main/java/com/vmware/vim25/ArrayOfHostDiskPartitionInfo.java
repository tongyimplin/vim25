package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostDiskPartitionInfo;
import com.vmware.vim25.HostDiskPartitionInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostDiskPartitionInfo", propOrder = {"hostDiskPartitionInfo"})
public class ArrayOfHostDiskPartitionInfo {
  @XmlElement(name = "HostDiskPartitionInfo")
  protected List<HostDiskPartitionInfo> hostDiskPartitionInfo;
  
  public List<HostDiskPartitionInfo> getHostDiskPartitionInfo() {
    if (this.hostDiskPartitionInfo == null)
      this.hostDiskPartitionInfo = new ArrayList<>(); 
    return this.hostDiskPartitionInfo;
  }
}
