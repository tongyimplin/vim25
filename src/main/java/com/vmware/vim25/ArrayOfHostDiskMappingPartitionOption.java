package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostDiskMappingPartitionOption;
import com.vmware.vim25.HostDiskMappingPartitionOption;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostDiskMappingPartitionOption", propOrder = {"hostDiskMappingPartitionOption"})
public class ArrayOfHostDiskMappingPartitionOption {
  @XmlElement(name = "HostDiskMappingPartitionOption")
  protected List<HostDiskMappingPartitionOption> hostDiskMappingPartitionOption;
  
  public List<HostDiskMappingPartitionOption> getHostDiskMappingPartitionOption() {
    if (this.hostDiskMappingPartitionOption == null)
      this.hostDiskMappingPartitionOption = new ArrayList<>(); 
    return this.hostDiskMappingPartitionOption;
  }
}
