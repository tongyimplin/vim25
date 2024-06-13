package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostPersistentMemoryInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPersistentMemoryInfo", propOrder = {"capacityInMB", "volumeUUID"})
public class HostPersistentMemoryInfo extends DynamicData {
  protected Long capacityInMB;
  
  protected String volumeUUID;
  
  public Long getCapacityInMB() {
    return this.capacityInMB;
  }
  
  public void setCapacityInMB(Long paramLong) {
    this.capacityInMB = paramLong;
  }
  
  public String getVolumeUUID() {
    return this.volumeUUID;
  }
  
  public void setVolumeUUID(String paramString) {
    this.volumeUUID = paramString;
  }
}
