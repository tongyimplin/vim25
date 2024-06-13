package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostDiskDimensionsLba;
import com.vmware.vim25.HostDiskPartitionBlockRange;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDiskPartitionBlockRange", propOrder = {"partition", "type", "start", "end"})
public class HostDiskPartitionBlockRange extends DynamicData {
  protected Integer partition;
  
  @XmlElement(required = true)
  protected String type;
  
  @XmlElement(required = true)
  protected HostDiskDimensionsLba start;
  
  @XmlElement(required = true)
  protected HostDiskDimensionsLba end;
  
  public Integer getPartition() {
    return this.partition;
  }
  
  public void setPartition(Integer paramInteger) {
    this.partition = paramInteger;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public HostDiskDimensionsLba getStart() {
    return this.start;
  }
  
  public void setStart(HostDiskDimensionsLba paramHostDiskDimensionsLba) {
    this.start = paramHostDiskDimensionsLba;
  }
  
  public HostDiskDimensionsLba getEnd() {
    return this.end;
  }
  
  public void setEnd(HostDiskDimensionsLba paramHostDiskDimensionsLba) {
    this.end = paramHostDiskDimensionsLba;
  }
}
