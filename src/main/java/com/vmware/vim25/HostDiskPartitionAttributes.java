package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostDiskPartitionAttributes;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDiskPartitionAttributes", propOrder = {"partition", "startSector", "endSector", "type", "guid", "logical", "attributes", "partitionAlignment"})
public class HostDiskPartitionAttributes extends DynamicData {
  protected int partition;
  
  protected long startSector;
  
  protected long endSector;
  
  @XmlElement(required = true)
  protected String type;
  
  protected String guid;
  
  protected boolean logical;
  
  protected byte attributes;
  
  protected Long partitionAlignment;
  
  public int getPartition() {
    return this.partition;
  }
  
  public void setPartition(int paramInt) {
    this.partition = paramInt;
  }
  
  public long getStartSector() {
    return this.startSector;
  }
  
  public void setStartSector(long paramLong) {
    this.startSector = paramLong;
  }
  
  public long getEndSector() {
    return this.endSector;
  }
  
  public void setEndSector(long paramLong) {
    this.endSector = paramLong;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public String getGuid() {
    return this.guid;
  }
  
  public void setGuid(String paramString) {
    this.guid = paramString;
  }
  
  public boolean isLogical() {
    return this.logical;
  }
  
  public void setLogical(boolean paramBoolean) {
    this.logical = paramBoolean;
  }
  
  public byte getAttributes() {
    return this.attributes;
  }
  
  public void setAttributes(byte paramByte) {
    this.attributes = paramByte;
  }
  
  public Long getPartitionAlignment() {
    return this.partitionAlignment;
  }
  
  public void setPartitionAlignment(Long paramLong) {
    this.partitionAlignment = paramLong;
  }
}
