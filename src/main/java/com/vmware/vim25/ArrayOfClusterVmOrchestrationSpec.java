package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterVmOrchestrationSpec;
import com.vmware.vim25.ClusterVmOrchestrationSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterVmOrchestrationSpec", propOrder = {"clusterVmOrchestrationSpec"})
public class ArrayOfClusterVmOrchestrationSpec {
  @XmlElement(name = "ClusterVmOrchestrationSpec")
  protected List<ClusterVmOrchestrationSpec> clusterVmOrchestrationSpec;
  
  public List<ClusterVmOrchestrationSpec> getClusterVmOrchestrationSpec() {
    if (this.clusterVmOrchestrationSpec == null)
      this.clusterVmOrchestrationSpec = new ArrayList<>(); 
    return this.clusterVmOrchestrationSpec;
  }
}
