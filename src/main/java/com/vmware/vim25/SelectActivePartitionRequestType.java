package com.vmware.vim25;

import com.vmware.vim25.HostScsiDiskPartition;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.SelectActivePartitionRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectActivePartitionRequestType", propOrder = {"_this", "partition"})
public class SelectActivePartitionRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected HostScsiDiskPartition partition;
  
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
}
