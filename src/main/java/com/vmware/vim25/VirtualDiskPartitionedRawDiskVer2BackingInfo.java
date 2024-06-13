package com.vmware.vim25;

import com.vmware.vim25.VirtualDiskPartitionedRawDiskVer2BackingInfo;
import com.vmware.vim25.VirtualDiskRawDiskVer2BackingInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskPartitionedRawDiskVer2BackingInfo", propOrder = {"partition"})
public class VirtualDiskPartitionedRawDiskVer2BackingInfo extends VirtualDiskRawDiskVer2BackingInfo {
  @XmlElement(type = Integer.class)
  protected List<Integer> partition;
  
  public List<Integer> getPartition() {
    if (this.partition == null)
      this.partition = new ArrayList<>(); 
    return this.partition;
  }
}
