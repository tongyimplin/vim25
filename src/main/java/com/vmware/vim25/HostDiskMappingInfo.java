package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostDiskMappingInfo;
import com.vmware.vim25.HostDiskMappingPartitionInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDiskMappingInfo", propOrder = {"physicalPartition", "name", "exclusive"})
public class HostDiskMappingInfo extends DynamicData {
  protected HostDiskMappingPartitionInfo physicalPartition;
  
  @XmlElement(required = true)
  protected String name;
  
  protected Boolean exclusive;
  
  public HostDiskMappingPartitionInfo getPhysicalPartition() {
    return this.physicalPartition;
  }
  
  public void setPhysicalPartition(HostDiskMappingPartitionInfo paramHostDiskMappingPartitionInfo) {
    this.physicalPartition = paramHostDiskMappingPartitionInfo;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public Boolean isExclusive() {
    return this.exclusive;
  }
  
  public void setExclusive(Boolean paramBoolean) {
    this.exclusive = paramBoolean;
  }
}
