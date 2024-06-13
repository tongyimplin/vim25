package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.StoragePodSummary;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoragePodSummary", propOrder = {"name", "capacity", "freeSpace"})
public class StoragePodSummary extends DynamicData {
  @XmlElement(required = true)
  protected String name;
  
  protected long capacity;
  
  protected long freeSpace;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public long getCapacity() {
    return this.capacity;
  }
  
  public void setCapacity(long paramLong) {
    this.capacity = paramLong;
  }
  
  public long getFreeSpace() {
    return this.freeSpace;
  }
  
  public void setFreeSpace(long paramLong) {
    this.freeSpace = paramLong;
  }
}
