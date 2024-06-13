package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.NvdimmInterleaveSetInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NvdimmInterleaveSetInfo", propOrder = {"setId", "rangeType", "baseAddress", "size", "availableSize", "deviceList", "state"})
public class NvdimmInterleaveSetInfo extends DynamicData {
  protected int setId;
  
  @XmlElement(required = true)
  protected String rangeType;
  
  protected long baseAddress;
  
  protected long size;
  
  protected long availableSize;
  
  @XmlElement(type = Integer.class)
  protected List<Integer> deviceList;
  
  @XmlElement(required = true)
  protected String state;
  
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
  
  public long getBaseAddress() {
    return this.baseAddress;
  }
  
  public void setBaseAddress(long paramLong) {
    this.baseAddress = paramLong;
  }
  
  public long getSize() {
    return this.size;
  }
  
  public void setSize(long paramLong) {
    this.size = paramLong;
  }
  
  public long getAvailableSize() {
    return this.availableSize;
  }
  
  public void setAvailableSize(long paramLong) {
    this.availableSize = paramLong;
  }
  
  public List<Integer> getDeviceList() {
    if (this.deviceList == null)
      this.deviceList = new ArrayList<>(); 
    return this.deviceList;
  }
  
  public String getState() {
    return this.state;
  }
  
  public void setState(String paramString) {
    this.state = paramString;
  }
}
