package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostNvmeNamespace;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNvmeNamespace", propOrder = {"key", "name", "id", "blockSize", "capacityInBlocks"})
public class HostNvmeNamespace extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected String name;
  
  protected int id;
  
  protected int blockSize;
  
  protected long capacityInBlocks;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public int getId() {
    return this.id;
  }
  
  public void setId(int paramInt) {
    this.id = paramInt;
  }
  
  public int getBlockSize() {
    return this.blockSize;
  }
  
  public void setBlockSize(int paramInt) {
    this.blockSize = paramInt;
  }
  
  public long getCapacityInBlocks() {
    return this.capacityInBlocks;
  }
  
  public void setCapacityInBlocks(long paramLong) {
    this.capacityInBlocks = paramLong;
  }
}
