package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostVFlashManagerVFlashResourceRunTimeInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVFlashManagerVFlashResourceRunTimeInfo", propOrder = {"usage", "capacity", "accessible", "capacityForVmCache", "freeForVmCache"})
public class HostVFlashManagerVFlashResourceRunTimeInfo extends DynamicData {
  protected long usage;
  
  protected long capacity;
  
  protected boolean accessible;
  
  protected long capacityForVmCache;
  
  protected long freeForVmCache;
  
  public long getUsage() {
    return this.usage;
  }
  
  public void setUsage(long paramLong) {
    this.usage = paramLong;
  }
  
  public long getCapacity() {
    return this.capacity;
  }
  
  public void setCapacity(long paramLong) {
    this.capacity = paramLong;
  }
  
  public boolean isAccessible() {
    return this.accessible;
  }
  
  public void setAccessible(boolean paramBoolean) {
    this.accessible = paramBoolean;
  }
  
  public long getCapacityForVmCache() {
    return this.capacityForVmCache;
  }
  
  public void setCapacityForVmCache(long paramLong) {
    this.capacityForVmCache = paramLong;
  }
  
  public long getFreeForVmCache() {
    return this.freeForVmCache;
  }
  
  public void setFreeForVmCache(long paramLong) {
    this.freeForVmCache = paramLong;
  }
}
