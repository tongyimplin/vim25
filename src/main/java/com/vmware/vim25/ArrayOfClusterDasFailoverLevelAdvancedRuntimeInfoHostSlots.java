package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots;
import com.vmware.vim25.ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots", propOrder = {"clusterDasFailoverLevelAdvancedRuntimeInfoHostSlots"})
public class ArrayOfClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots {
  @XmlElement(name = "ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots")
  protected List<ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots> clusterDasFailoverLevelAdvancedRuntimeInfoHostSlots;
  
  public List<ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots> getClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots() {
    if (this.clusterDasFailoverLevelAdvancedRuntimeInfoHostSlots == null)
      this.clusterDasFailoverLevelAdvancedRuntimeInfoHostSlots = new ArrayList<>(); 
    return this.clusterDasFailoverLevelAdvancedRuntimeInfoHostSlots;
  }
}
