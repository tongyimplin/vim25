package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots;
import com.vmware.vim25.ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots", propOrder = {"clusterDasFailoverLevelAdvancedRuntimeInfoVmSlots"})
public class ArrayOfClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots {
  @XmlElement(name = "ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots")
  protected List<ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots> clusterDasFailoverLevelAdvancedRuntimeInfoVmSlots;
  
  public List<ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots> getClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots() {
    if (this.clusterDasFailoverLevelAdvancedRuntimeInfoVmSlots == null)
      this.clusterDasFailoverLevelAdvancedRuntimeInfoVmSlots = new ArrayList<>(); 
    return this.clusterDasFailoverLevelAdvancedRuntimeInfoVmSlots;
  }
}
