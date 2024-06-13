package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostScsiDiskPartition;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostScsiDiskPartition", propOrder = {"diskName", "partition"})
public class HostScsiDiskPartition extends DynamicData {
  @XmlElement(required = true)
  protected String diskName;
  
  protected int partition;
  
  public String getDiskName() {
    return this.diskName;
  }
  
  public void setDiskName(String paramString) {
    this.diskName = paramString;
  }
  
  public int getPartition() {
    return this.partition;
  }
  
  public void setPartition(int paramInt) {
    this.partition = paramInt;
  }
}
