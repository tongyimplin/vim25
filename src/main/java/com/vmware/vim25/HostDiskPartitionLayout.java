package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostDiskDimensionsLba;
import com.vmware.vim25.HostDiskPartitionBlockRange;
import com.vmware.vim25.HostDiskPartitionLayout;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDiskPartitionLayout", propOrder = {"total", "partition"})
public class HostDiskPartitionLayout extends DynamicData {
  protected HostDiskDimensionsLba total;
  
  @XmlElement(required = true)
  protected List<HostDiskPartitionBlockRange> partition;
  
  public HostDiskDimensionsLba getTotal() {
    return this.total;
  }
  
  public void setTotal(HostDiskDimensionsLba paramHostDiskDimensionsLba) {
    this.total = paramHostDiskDimensionsLba;
  }
  
  public List<HostDiskPartitionBlockRange> getPartition() {
    if (this.partition == null)
      this.partition = new ArrayList<>(); 
    return this.partition;
  }
}
