package com.vmware.vim25;

import com.vmware.vim25.ClusterDasAdmissionControlPolicy;
import com.vmware.vim25.ClusterFailoverLevelAdmissionControlPolicy;
import com.vmware.vim25.ClusterSlotPolicy;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterFailoverLevelAdmissionControlPolicy", propOrder = {"failoverLevel", "slotPolicy"})
public class ClusterFailoverLevelAdmissionControlPolicy extends ClusterDasAdmissionControlPolicy {
  protected int failoverLevel;
  
  protected ClusterSlotPolicy slotPolicy;
  
  public int getFailoverLevel() {
    return this.failoverLevel;
  }
  
  public void setFailoverLevel(int paramInt) {
    this.failoverLevel = paramInt;
  }
  
  public ClusterSlotPolicy getSlotPolicy() {
    return this.slotPolicy;
  }
  
  public void setSlotPolicy(ClusterSlotPolicy paramClusterSlotPolicy) {
    this.slotPolicy = paramClusterSlotPolicy;
  }
}
