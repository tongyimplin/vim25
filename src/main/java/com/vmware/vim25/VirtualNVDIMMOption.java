package com.vmware.vim25;

import com.vmware.vim25.LongOption;
import com.vmware.vim25.VirtualDeviceOption;
import com.vmware.vim25.VirtualNVDIMMOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualNVDIMMOption", propOrder = {"capacityInMB", "growable", "hotGrowable", "granularityInMB"})
public class VirtualNVDIMMOption extends VirtualDeviceOption {
  @XmlElement(required = true)
  protected LongOption capacityInMB;
  
  protected boolean growable;
  
  protected boolean hotGrowable;
  
  protected long granularityInMB;
  
  public LongOption getCapacityInMB() {
    return this.capacityInMB;
  }
  
  public void setCapacityInMB(LongOption paramLongOption) {
    this.capacityInMB = paramLongOption;
  }
  
  public boolean isGrowable() {
    return this.growable;
  }
  
  public void setGrowable(boolean paramBoolean) {
    this.growable = paramBoolean;
  }
  
  public boolean isHotGrowable() {
    return this.hotGrowable;
  }
  
  public void setHotGrowable(boolean paramBoolean) {
    this.hotGrowable = paramBoolean;
  }
  
  public long getGranularityInMB() {
    return this.granularityInMB;
  }
  
  public void setGranularityInMB(long paramLong) {
    this.granularityInMB = paramLong;
  }
}
