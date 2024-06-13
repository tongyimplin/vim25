package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.NvdimmRegionInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NvdimmRegionInfo", propOrder = {"regionId", "setId", "rangeType", "startAddr", "size", "offset"})
public class NvdimmRegionInfo extends DynamicData {
  protected int regionId;
  
  protected int setId;
  
  @XmlElement(required = true)
  protected String rangeType;
  
  protected long startAddr;
  
  protected long size;
  
  protected long offset;
  
  public int getRegionId() {
    return this.regionId;
  }
  
  public void setRegionId(int paramInt) {
    this.regionId = paramInt;
  }
  
  public int getSetId() {
    return this.setId;
  }
  
  public void setSetId(int paramInt) {
    this.setId = paramInt;
  }
  
  public String getRangeType() {
    return this.rangeType;
  }
  
  public void setRangeType(String paramString) {
    this.rangeType = paramString;
  }
  
  public long getStartAddr() {
    return this.startAddr;
  }
  
  public void setStartAddr(long paramLong) {
    this.startAddr = paramLong;
  }
  
  public long getSize() {
    return this.size;
  }
  
  public void setSize(long paramLong) {
    this.size = paramLong;
  }
  
  public long getOffset() {
    return this.offset;
  }
  
  public void setOffset(long paramLong) {
    this.offset = paramLong;
  }
}
