package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostVFlashManagerVFlashResourceConfigInfo;
import com.vmware.vim25.HostVffsVolume;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVFlashManagerVFlashResourceConfigInfo", propOrder = {"vffs", "capacity"})
public class HostVFlashManagerVFlashResourceConfigInfo extends DynamicData {
  protected HostVffsVolume vffs;
  
  protected long capacity;
  
  public HostVffsVolume getVffs() {
    return this.vffs;
  }
  
  public void setVffs(HostVffsVolume paramHostVffsVolume) {
    this.vffs = paramHostVffsVolume;
  }
  
  public long getCapacity() {
    return this.capacity;
  }
  
  public void setCapacity(long paramLong) {
    this.capacity = paramLong;
  }
}
