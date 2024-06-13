package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineNetworkShaperInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineNetworkShaperInfo", propOrder = {"enabled", "peakBps", "averageBps", "burstSize"})
public class VirtualMachineNetworkShaperInfo extends DynamicData {
  protected Boolean enabled;
  
  protected Long peakBps;
  
  protected Long averageBps;
  
  protected Long burstSize;
  
  public Boolean isEnabled() {
    return this.enabled;
  }
  
  public void setEnabled(Boolean paramBoolean) {
    this.enabled = paramBoolean;
  }
  
  public Long getPeakBps() {
    return this.peakBps;
  }
  
  public void setPeakBps(Long paramLong) {
    this.peakBps = paramLong;
  }
  
  public Long getAverageBps() {
    return this.averageBps;
  }
  
  public void setAverageBps(Long paramLong) {
    this.averageBps = paramLong;
  }
  
  public Long getBurstSize() {
    return this.burstSize;
  }
  
  public void setBurstSize(Long paramLong) {
    this.burstSize = paramLong;
  }
}
