package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostVFlashManagerVFlashCacheConfigInfo;
import com.vmware.vim25.HostVFlashManagerVFlashConfigInfo;
import com.vmware.vim25.HostVFlashManagerVFlashResourceConfigInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVFlashManagerVFlashConfigInfo", propOrder = {"vFlashResourceConfigInfo", "vFlashCacheConfigInfo"})
public class HostVFlashManagerVFlashConfigInfo extends DynamicData {
  protected HostVFlashManagerVFlashResourceConfigInfo vFlashResourceConfigInfo;
  
  protected HostVFlashManagerVFlashCacheConfigInfo vFlashCacheConfigInfo;
  
  public HostVFlashManagerVFlashResourceConfigInfo getVFlashResourceConfigInfo() {
    return this.vFlashResourceConfigInfo;
  }
  
  public void setVFlashResourceConfigInfo(HostVFlashManagerVFlashResourceConfigInfo paramHostVFlashManagerVFlashResourceConfigInfo) {
    this.vFlashResourceConfigInfo = paramHostVFlashManagerVFlashResourceConfigInfo;
  }
  
  public HostVFlashManagerVFlashCacheConfigInfo getVFlashCacheConfigInfo() {
    return this.vFlashCacheConfigInfo;
  }
  
  public void setVFlashCacheConfigInfo(HostVFlashManagerVFlashCacheConfigInfo paramHostVFlashManagerVFlashCacheConfigInfo) {
    this.vFlashCacheConfigInfo = paramHostVFlashManagerVFlashCacheConfigInfo;
  }
}
