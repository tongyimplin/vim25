package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostVFlashManagerVFlashCacheConfigInfo;
import com.vmware.vim25.HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVFlashManagerVFlashCacheConfigInfo", propOrder = {"vFlashModuleConfigOption", "defaultVFlashModule", "swapCacheReservationInGB"})
public class HostVFlashManagerVFlashCacheConfigInfo extends DynamicData {
  protected List<HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption> vFlashModuleConfigOption;
  
  protected String defaultVFlashModule;
  
  protected Long swapCacheReservationInGB;
  
  public List<HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption> getVFlashModuleConfigOption() {
    if (this.vFlashModuleConfigOption == null)
      this.vFlashModuleConfigOption = new ArrayList<>(); 
    return this.vFlashModuleConfigOption;
  }
  
  public String getDefaultVFlashModule() {
    return this.defaultVFlashModule;
  }
  
  public void setDefaultVFlashModule(String paramString) {
    this.defaultVFlashModule = paramString;
  }
  
  public Long getSwapCacheReservationInGB() {
    return this.swapCacheReservationInGB;
  }
  
  public void setSwapCacheReservationInGB(Long paramLong) {
    this.swapCacheReservationInGB = paramLong;
  }
}
