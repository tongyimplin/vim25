package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.NvdimmDimmInfo;
import com.vmware.vim25.NvdimmHealthInfo;
import com.vmware.vim25.NvdimmRegionInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NvdimmDimmInfo", propOrder = {"dimmHandle", "healthInfo", "totalCapacity", "persistentCapacity", "availablePersistentCapacity", "volatileCapacity", "availableVolatileCapacity", "blockCapacity", "regionInfo", "representationString"})
public class NvdimmDimmInfo extends DynamicData {
  protected int dimmHandle;
  
  @XmlElement(required = true)
  protected NvdimmHealthInfo healthInfo;
  
  protected long totalCapacity;
  
  protected long persistentCapacity;
  
  protected long availablePersistentCapacity;
  
  protected long volatileCapacity;
  
  protected long availableVolatileCapacity;
  
  protected long blockCapacity;
  
  protected List<NvdimmRegionInfo> regionInfo;
  
  @XmlElement(required = true)
  protected String representationString;
  
  public int getDimmHandle() {
    return this.dimmHandle;
  }
  
  public void setDimmHandle(int paramInt) {
    this.dimmHandle = paramInt;
  }
  
  public NvdimmHealthInfo getHealthInfo() {
    return this.healthInfo;
  }
  
  public void setHealthInfo(NvdimmHealthInfo paramNvdimmHealthInfo) {
    this.healthInfo = paramNvdimmHealthInfo;
  }
  
  public long getTotalCapacity() {
    return this.totalCapacity;
  }
  
  public void setTotalCapacity(long paramLong) {
    this.totalCapacity = paramLong;
  }
  
  public long getPersistentCapacity() {
    return this.persistentCapacity;
  }
  
  public void setPersistentCapacity(long paramLong) {
    this.persistentCapacity = paramLong;
  }
  
  public long getAvailablePersistentCapacity() {
    return this.availablePersistentCapacity;
  }
  
  public void setAvailablePersistentCapacity(long paramLong) {
    this.availablePersistentCapacity = paramLong;
  }
  
  public long getVolatileCapacity() {
    return this.volatileCapacity;
  }
  
  public void setVolatileCapacity(long paramLong) {
    this.volatileCapacity = paramLong;
  }
  
  public long getAvailableVolatileCapacity() {
    return this.availableVolatileCapacity;
  }
  
  public void setAvailableVolatileCapacity(long paramLong) {
    this.availableVolatileCapacity = paramLong;
  }
  
  public long getBlockCapacity() {
    return this.blockCapacity;
  }
  
  public void setBlockCapacity(long paramLong) {
    this.blockCapacity = paramLong;
  }
  
  public List<NvdimmRegionInfo> getRegionInfo() {
    if (this.regionInfo == null)
      this.regionInfo = new ArrayList<>(); 
    return this.regionInfo;
  }
  
  public String getRepresentationString() {
    return this.representationString;
  }
  
  public void setRepresentationString(String paramString) {
    this.representationString = paramString;
  }
}
