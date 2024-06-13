package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostDiskDimensionsChs;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDiskDimensionsChs", propOrder = {"cylinder", "head", "sector"})
public class HostDiskDimensionsChs extends DynamicData {
  protected long cylinder;
  
  protected int head;
  
  protected int sector;
  
  public long getCylinder() {
    return this.cylinder;
  }
  
  public void setCylinder(long paramLong) {
    this.cylinder = paramLong;
  }
  
  public int getHead() {
    return this.head;
  }
  
  public void setHead(int paramInt) {
    this.head = paramInt;
  }
  
  public int getSector() {
    return this.sector;
  }
  
  public void setSector(int paramInt) {
    this.sector = paramInt;
  }
}
