package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostDiskDimensionsChs;
import com.vmware.vim25.HostDiskPartitionAttributes;
import com.vmware.vim25.HostDiskPartitionSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDiskPartitionSpec", propOrder = {"partitionFormat", "chs", "totalSectors", "partition"})
public class HostDiskPartitionSpec extends DynamicData {
  protected String partitionFormat;
  
  protected HostDiskDimensionsChs chs;
  
  protected Long totalSectors;
  
  protected List<HostDiskPartitionAttributes> partition;
  
  public String getPartitionFormat() {
    return this.partitionFormat;
  }
  
  public void setPartitionFormat(String paramString) {
    this.partitionFormat = paramString;
  }
  
  public HostDiskDimensionsChs getChs() {
    return this.chs;
  }
  
  public void setChs(HostDiskDimensionsChs paramHostDiskDimensionsChs) {
    this.chs = paramHostDiskDimensionsChs;
  }
  
  public Long getTotalSectors() {
    return this.totalSectors;
  }
  
  public void setTotalSectors(Long paramLong) {
    this.totalSectors = paramLong;
  }
  
  public List<HostDiskPartitionAttributes> getPartition() {
    if (this.partition == null)
      this.partition = new ArrayList<>(); 
    return this.partition;
  }
}
