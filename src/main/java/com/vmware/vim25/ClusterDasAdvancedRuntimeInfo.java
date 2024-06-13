package com.vmware.vim25;

import com.vmware.vim25.ClusterDasAdvancedRuntimeInfo;
import com.vmware.vim25.ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo;
import com.vmware.vim25.ClusterDasFailoverLevelAdvancedRuntimeInfo;
import com.vmware.vim25.ClusterDasHostInfo;
import com.vmware.vim25.DasHeartbeatDatastoreInfo;
import com.vmware.vim25.DynamicData;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDasAdvancedRuntimeInfo", propOrder = {"dasHostInfo", "vmcpSupported", "heartbeatDatastoreInfo"})
@XmlSeeAlso({ClusterDasFailoverLevelAdvancedRuntimeInfo.class})
public class ClusterDasAdvancedRuntimeInfo extends DynamicData {
  protected ClusterDasHostInfo dasHostInfo;
  
  protected ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo vmcpSupported;
  
  protected List<DasHeartbeatDatastoreInfo> heartbeatDatastoreInfo;
  
  public ClusterDasHostInfo getDasHostInfo() {
    return this.dasHostInfo;
  }
  
  public void setDasHostInfo(ClusterDasHostInfo paramClusterDasHostInfo) {
    this.dasHostInfo = paramClusterDasHostInfo;
  }
  
  public ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo getVmcpSupported() {
    return this.vmcpSupported;
  }
  
  public void setVmcpSupported(ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo paramClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo) {
    this.vmcpSupported = paramClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo;
  }
  
  public List<DasHeartbeatDatastoreInfo> getHeartbeatDatastoreInfo() {
    if (this.heartbeatDatastoreInfo == null)
      this.heartbeatDatastoreInfo = new ArrayList<>(); 
    return this.heartbeatDatastoreInfo;
  }
}
