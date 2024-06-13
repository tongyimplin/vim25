package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostDiskMappingOption;
import com.vmware.vim25.HostDiskMappingPartitionOption;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDiskMappingOption", propOrder = {"physicalPartition", "name"})
public class HostDiskMappingOption extends DynamicData {
  protected List<HostDiskMappingPartitionOption> physicalPartition;
  
  @XmlElement(required = true)
  protected String name;
  
  public List<HostDiskMappingPartitionOption> getPhysicalPartition() {
    if (this.physicalPartition == null)
      this.physicalPartition = new ArrayList<>(); 
    return this.physicalPartition;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
}
