package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostDiskDimensionsLba;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDiskDimensionsLba", propOrder = {"blockSize", "block"})
public class HostDiskDimensionsLba extends DynamicData {
  protected int blockSize;
  
  protected long block;
  
  public int getBlockSize() {
    return this.blockSize;
  }
  
  public void setBlockSize(int paramInt) {
    this.blockSize = paramInt;
  }
  
  public long getBlock() {
    return this.block;
  }
  
  public void setBlock(long paramLong) {
    this.block = paramLong;
  }
}
