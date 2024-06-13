package com.vmware.vim25;

import com.vmware.vim25.BoolPolicy;
import com.vmware.vim25.DVSTrafficShapingPolicy;
import com.vmware.vim25.InheritablePolicy;
import com.vmware.vim25.LongPolicy;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSTrafficShapingPolicy", propOrder = {"enabled", "averageBandwidth", "peakBandwidth", "burstSize"})
public class DVSTrafficShapingPolicy extends InheritablePolicy {
  protected BoolPolicy enabled;
  
  protected LongPolicy averageBandwidth;
  
  protected LongPolicy peakBandwidth;
  
  protected LongPolicy burstSize;
  
  public BoolPolicy getEnabled() {
    return this.enabled;
  }
  
  public void setEnabled(BoolPolicy paramBoolPolicy) {
    this.enabled = paramBoolPolicy;
  }
  
  public LongPolicy getAverageBandwidth() {
    return this.averageBandwidth;
  }
  
  public void setAverageBandwidth(LongPolicy paramLongPolicy) {
    this.averageBandwidth = paramLongPolicy;
  }
  
  public LongPolicy getPeakBandwidth() {
    return this.peakBandwidth;
  }
  
  public void setPeakBandwidth(LongPolicy paramLongPolicy) {
    this.peakBandwidth = paramLongPolicy;
  }
  
  public LongPolicy getBurstSize() {
    return this.burstSize;
  }
  
  public void setBurstSize(LongPolicy paramLongPolicy) {
    this.burstSize = paramLongPolicy;
  }
}
