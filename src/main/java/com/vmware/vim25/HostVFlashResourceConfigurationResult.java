package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostDiskConfigurationResult;
import com.vmware.vim25.HostVFlashResourceConfigurationResult;
import com.vmware.vim25.HostVffsVolume;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVFlashResourceConfigurationResult", propOrder = {"devicePath", "vffs", "diskConfigurationResult"})
public class HostVFlashResourceConfigurationResult extends DynamicData {
  protected List<String> devicePath;
  
  protected HostVffsVolume vffs;
  
  protected List<HostDiskConfigurationResult> diskConfigurationResult;
  
  public List<String> getDevicePath() {
    if (this.devicePath == null)
      this.devicePath = new ArrayList<>(); 
    return this.devicePath;
  }
  
  public HostVffsVolume getVffs() {
    return this.vffs;
  }
  
  public void setVffs(HostVffsVolume paramHostVffsVolume) {
    this.vffs = paramHostVffsVolume;
  }
  
  public List<HostDiskConfigurationResult> getDiskConfigurationResult() {
    if (this.diskConfigurationResult == null)
      this.diskConfigurationResult = new ArrayList<>(); 
    return this.diskConfigurationResult;
  }
}
