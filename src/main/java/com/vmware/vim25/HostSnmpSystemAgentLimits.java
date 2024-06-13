package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostSnmpAgentCapability;
import com.vmware.vim25.HostSnmpSystemAgentLimits;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSnmpSystemAgentLimits", propOrder = {"maxReadOnlyCommunities", "maxTrapDestinations", "maxCommunityLength", "maxBufferSize", "capability"})
public class HostSnmpSystemAgentLimits extends DynamicData {
  protected int maxReadOnlyCommunities;
  
  protected int maxTrapDestinations;
  
  protected int maxCommunityLength;
  
  protected int maxBufferSize;
  
  protected HostSnmpAgentCapability capability;
  
  public int getMaxReadOnlyCommunities() {
    return this.maxReadOnlyCommunities;
  }
  
  public void setMaxReadOnlyCommunities(int paramInt) {
    this.maxReadOnlyCommunities = paramInt;
  }
  
  public int getMaxTrapDestinations() {
    return this.maxTrapDestinations;
  }
  
  public void setMaxTrapDestinations(int paramInt) {
    this.maxTrapDestinations = paramInt;
  }
  
  public int getMaxCommunityLength() {
    return this.maxCommunityLength;
  }
  
  public void setMaxCommunityLength(int paramInt) {
    this.maxCommunityLength = paramInt;
  }
  
  public int getMaxBufferSize() {
    return this.maxBufferSize;
  }
  
  public void setMaxBufferSize(int paramInt) {
    this.maxBufferSize = paramInt;
  }
  
  public HostSnmpAgentCapability getCapability() {
    return this.capability;
  }
  
  public void setCapability(HostSnmpAgentCapability paramHostSnmpAgentCapability) {
    this.capability = paramHostSnmpAgentCapability;
  }
}
