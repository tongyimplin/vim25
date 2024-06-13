package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostPlacedVirtualNicIdentifier;
import com.vmware.vim25.HostPnicNetworkResourceInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPnicNetworkResourceInfo", propOrder = {"pnicDevice", "availableBandwidthForVMTraffic", "unusedBandwidthForVMTraffic", "placedVirtualNics"})
public class HostPnicNetworkResourceInfo extends DynamicData {
  @XmlElement(required = true)
  protected String pnicDevice;
  
  protected Long availableBandwidthForVMTraffic;
  
  protected Long unusedBandwidthForVMTraffic;
  
  protected List<HostPlacedVirtualNicIdentifier> placedVirtualNics;
  
  public String getPnicDevice() {
    return this.pnicDevice;
  }
  
  public void setPnicDevice(String paramString) {
    this.pnicDevice = paramString;
  }
  
  public Long getAvailableBandwidthForVMTraffic() {
    return this.availableBandwidthForVMTraffic;
  }
  
  public void setAvailableBandwidthForVMTraffic(Long paramLong) {
    this.availableBandwidthForVMTraffic = paramLong;
  }
  
  public Long getUnusedBandwidthForVMTraffic() {
    return this.unusedBandwidthForVMTraffic;
  }
  
  public void setUnusedBandwidthForVMTraffic(Long paramLong) {
    this.unusedBandwidthForVMTraffic = paramLong;
  }
  
  public List<HostPlacedVirtualNicIdentifier> getPlacedVirtualNics() {
    if (this.placedVirtualNics == null)
      this.placedVirtualNics = new ArrayList<>(); 
    return this.placedVirtualNics;
  }
}
