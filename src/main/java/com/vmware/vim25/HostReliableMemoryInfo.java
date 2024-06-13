package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostReliableMemoryInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostReliableMemoryInfo", propOrder = {"memorySize"})
public class HostReliableMemoryInfo extends DynamicData {
  protected long memorySize;
  
  public long getMemorySize() {
    return this.memorySize;
  }
  
  public void setMemorySize(long paramLong) {
    this.memorySize = paramLong;
  }
}
