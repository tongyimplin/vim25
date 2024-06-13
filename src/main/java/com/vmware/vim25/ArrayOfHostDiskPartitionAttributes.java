package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostDiskPartitionAttributes;
import com.vmware.vim25.HostDiskPartitionAttributes;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostDiskPartitionAttributes", propOrder = {"hostDiskPartitionAttributes"})
public class ArrayOfHostDiskPartitionAttributes {
  @XmlElement(name = "HostDiskPartitionAttributes")
  protected List<HostDiskPartitionAttributes> hostDiskPartitionAttributes;
  
  public List<HostDiskPartitionAttributes> getHostDiskPartitionAttributes() {
    if (this.hostDiskPartitionAttributes == null)
      this.hostDiskPartitionAttributes = new ArrayList<>(); 
    return this.hostDiskPartitionAttributes;
  }
}
