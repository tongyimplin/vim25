package com.vmware.vim25;

import com.vmware.vim25.ComputeDiskPartitionInfoForResizeRequestType;
import com.vmware.vim25.HostDiskPartitionBlockRange;
import com.vmware.vim25.HostScsiDiskPartition;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComputeDiskPartitionInfoForResizeRequestType", propOrder = {"_this", "partition", "blockRange", "partitionFormat"})
public class ComputeDiskPartitionInfoForResizeRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostScsiDiskPartition partition;
  
  @XmlElement(required = true)
  protected HostDiskPartitionBlockRange blockRange;
  
  protected String partitionFormat;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostScsiDiskPartition getPartition() {
    return this.partition;
  }
  
  public void setPartition(HostScsiDiskPartition paramHostScsiDiskPartition) {
    this.partition = paramHostScsiDiskPartition;
  }
  
  public HostDiskPartitionBlockRange getBlockRange() {
    return this.blockRange;
  }
  
  public void setBlockRange(HostDiskPartitionBlockRange paramHostDiskPartitionBlockRange) {
    this.blockRange = paramHostDiskPartitionBlockRange;
  }
  
  public String getPartitionFormat() {
    return this.partitionFormat;
  }
  
  public void setPartitionFormat(String paramString) {
    this.partitionFormat = paramString;
  }
}
