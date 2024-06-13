package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostVFlashManagerVFlashCacheConfigSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVFlashManagerVFlashCacheConfigSpec", propOrder = {"defaultVFlashModule", "swapCacheReservationInGB"})
public class HostVFlashManagerVFlashCacheConfigSpec extends DynamicData {
  @XmlElement(required = true)
  protected String defaultVFlashModule;
  
  protected long swapCacheReservationInGB;
  
  public String getDefaultVFlashModule() {
    return this.defaultVFlashModule;
  }
  
  public void setDefaultVFlashModule(String paramString) {
    this.defaultVFlashModule = paramString;
  }
  
  public long getSwapCacheReservationInGB() {
    return this.swapCacheReservationInGB;
  }
  
  public void setSwapCacheReservationInGB(long paramLong) {
    this.swapCacheReservationInGB = paramLong;
  }
}
