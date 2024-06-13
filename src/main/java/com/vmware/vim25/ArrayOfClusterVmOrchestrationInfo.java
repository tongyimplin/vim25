package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterVmOrchestrationInfo;
import com.vmware.vim25.ClusterVmOrchestrationInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterVmOrchestrationInfo", propOrder = {"clusterVmOrchestrationInfo"})
public class ArrayOfClusterVmOrchestrationInfo {
  @XmlElement(name = "ClusterVmOrchestrationInfo")
  protected List<ClusterVmOrchestrationInfo> clusterVmOrchestrationInfo;
  
  public List<ClusterVmOrchestrationInfo> getClusterVmOrchestrationInfo() {
    if (this.clusterVmOrchestrationInfo == null)
      this.clusterVmOrchestrationInfo = new ArrayList<>(); 
    return this.clusterVmOrchestrationInfo;
  }
}
