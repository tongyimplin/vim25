package com.vmware.vim25;

import com.vmware.vim25.ClusterDasAdvancedRuntimeInfo;
import com.vmware.vim25.ClusterDasFailoverLevelAdvancedRuntimeInfo;
import com.vmware.vim25.ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots;
import com.vmware.vim25.ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo;
import com.vmware.vim25.ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDasFailoverLevelAdvancedRuntimeInfo", propOrder = {"slotInfo", "totalSlots", "usedSlots", "unreservedSlots", "totalVms", "totalHosts", "totalGoodHosts", "hostSlots", "vmsRequiringMultipleSlots"})
public class ClusterDasFailoverLevelAdvancedRuntimeInfo extends ClusterDasAdvancedRuntimeInfo {
  @XmlElement(required = true)
  protected ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo slotInfo;
  
  protected int totalSlots;
  
  protected int usedSlots;
  
  protected int unreservedSlots;
  
  protected int totalVms;
  
  protected int totalHosts;
  
  protected int totalGoodHosts;
  
  protected List<ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots> hostSlots;
  
  protected List<ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots> vmsRequiringMultipleSlots;
  
  public ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo getSlotInfo() {
    return this.slotInfo;
  }
  
  public void setSlotInfo(ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo paramClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo) {
    this.slotInfo = paramClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo;
  }
  
  public int getTotalSlots() {
    return this.totalSlots;
  }
  
  public void setTotalSlots(int paramInt) {
    this.totalSlots = paramInt;
  }
  
  public int getUsedSlots() {
    return this.usedSlots;
  }
  
  public void setUsedSlots(int paramInt) {
    this.usedSlots = paramInt;
  }
  
  public int getUnreservedSlots() {
    return this.unreservedSlots;
  }
  
  public void setUnreservedSlots(int paramInt) {
    this.unreservedSlots = paramInt;
  }
  
  public int getTotalVms() {
    return this.totalVms;
  }
  
  public void setTotalVms(int paramInt) {
    this.totalVms = paramInt;
  }
  
  public int getTotalHosts() {
    return this.totalHosts;
  }
  
  public void setTotalHosts(int paramInt) {
    this.totalHosts = paramInt;
  }
  
  public int getTotalGoodHosts() {
    return this.totalGoodHosts;
  }
  
  public void setTotalGoodHosts(int paramInt) {
    this.totalGoodHosts = paramInt;
  }
  
  public List<ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots> getHostSlots() {
    if (this.hostSlots == null)
      this.hostSlots = new ArrayList<>(); 
    return this.hostSlots;
  }
  
  public List<ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots> getVmsRequiringMultipleSlots() {
    if (this.vmsRequiringMultipleSlots == null)
      this.vmsRequiringMultipleSlots = new ArrayList<>(); 
    return this.vmsRequiringMultipleSlots;
  }
}
