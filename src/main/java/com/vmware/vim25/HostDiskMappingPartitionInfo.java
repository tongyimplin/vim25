package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostDiskMappingPartitionInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDiskMappingPartitionInfo", propOrder = {"name", "fileSystem", "capacityInKb"})
public class HostDiskMappingPartitionInfo extends DynamicData {
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected String fileSystem;
  
  protected long capacityInKb;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getFileSystem() {
    return this.fileSystem;
  }
  
  public void setFileSystem(String paramString) {
    this.fileSystem = paramString;
  }
  
  public long getCapacityInKb() {
    return this.capacityInKb;
  }
  
  public void setCapacityInKb(long paramLong) {
    this.capacityInKb = paramLong;
  }
}
