package com.vmware.vim25;

import com.vmware.vim25.HostDiskPartitionSpec;
import com.vmware.vim25.HostScsiDiskPartition;
import com.vmware.vim25.VmfsDatastoreExpandSpec;
import com.vmware.vim25.VmfsDatastoreSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmfsDatastoreExpandSpec", propOrder = {"partition", "extent"})
public class VmfsDatastoreExpandSpec extends VmfsDatastoreSpec {
  @XmlElement(required = true)
  protected HostDiskPartitionSpec partition;
  
  @XmlElement(required = true)
  protected HostScsiDiskPartition extent;
  
  public HostDiskPartitionSpec getPartition() {
    return this.partition;
  }
  
  public void setPartition(HostDiskPartitionSpec paramHostDiskPartitionSpec) {
    this.partition = paramHostDiskPartitionSpec;
  }
  
  public HostScsiDiskPartition getExtent() {
    return this.extent;
  }
  
  public void setExtent(HostScsiDiskPartition paramHostScsiDiskPartition) {
    this.extent = paramHostScsiDiskPartition;
  }
}
