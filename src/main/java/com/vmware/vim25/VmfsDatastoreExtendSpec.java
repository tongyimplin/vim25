package com.vmware.vim25;

import com.vmware.vim25.HostDiskPartitionSpec;
import com.vmware.vim25.HostScsiDiskPartition;
import com.vmware.vim25.VmfsDatastoreExtendSpec;
import com.vmware.vim25.VmfsDatastoreSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmfsDatastoreExtendSpec", propOrder = {"partition", "extent"})
public class VmfsDatastoreExtendSpec extends VmfsDatastoreSpec {
  @XmlElement(required = true)
  protected HostDiskPartitionSpec partition;
  
  @XmlElement(required = true)
  protected List<HostScsiDiskPartition> extent;
  
  public HostDiskPartitionSpec getPartition() {
    return this.partition;
  }
  
  public void setPartition(HostDiskPartitionSpec paramHostDiskPartitionSpec) {
    this.partition = paramHostDiskPartitionSpec;
  }
  
  public List<HostScsiDiskPartition> getExtent() {
    if (this.extent == null)
      this.extent = new ArrayList<>(); 
    return this.extent;
  }
}
