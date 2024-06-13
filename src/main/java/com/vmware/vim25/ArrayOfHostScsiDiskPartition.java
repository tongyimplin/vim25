package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostScsiDiskPartition;
import com.vmware.vim25.HostScsiDiskPartition;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostScsiDiskPartition", propOrder = {"hostScsiDiskPartition"})
public class ArrayOfHostScsiDiskPartition {
  @XmlElement(name = "HostScsiDiskPartition")
  protected List<HostScsiDiskPartition> hostScsiDiskPartition;
  
  public List<HostScsiDiskPartition> getHostScsiDiskPartition() {
    if (this.hostScsiDiskPartition == null)
      this.hostScsiDiskPartition = new ArrayList<>(); 
    return this.hostScsiDiskPartition;
  }
}
