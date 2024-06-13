package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostNetworkTrafficShapingPolicy;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNetworkTrafficShapingPolicy", propOrder = {"enabled", "averageBandwidth", "peakBandwidth", "burstSize"})
public class HostNetworkTrafficShapingPolicy extends DynamicData {
  protected Boolean enabled;
  
  protected Long averageBandwidth;
  
  protected Long peakBandwidth;
  
  protected Long burstSize;
  
  public Boolean isEnabled() {
    return this.enabled;
  }
  
  public void setEnabled(Boolean paramBoolean) {
    this.enabled = paramBoolean;
  }
  
  public Long getAverageBandwidth() {
    return this.averageBandwidth;
  }
  
  public void setAverageBandwidth(Long paramLong) {
    this.averageBandwidth = paramLong;
  }
  
  public Long getPeakBandwidth() {
    return this.peakBandwidth;
  }
  
  public void setPeakBandwidth(Long paramLong) {
    this.peakBandwidth = paramLong;
  }
  
  public Long getBurstSize() {
    return this.burstSize;
  }
  
  public void setBurstSize(Long paramLong) {
    this.burstSize = paramLong;
  }
}
