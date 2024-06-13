package com.vmware.vim25;

import com.vmware.vim25.DiskChangeExtent;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiskChangeExtent", propOrder = {"start", "length"})
public class DiskChangeExtent extends DynamicData {
  protected long start;
  
  protected long length;
  
  public long getStart() {
    return this.start;
  }
  
  public void setStart(long paramLong) {
    this.start = paramLong;
  }
  
  public long getLength() {
    return this.length;
  }
  
  public void setLength(long paramLong) {
    this.length = paramLong;
  }
}
