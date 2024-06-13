package com.vmware.vim25;

import com.vmware.vim25.ClusterOrchestrationInfo;
import com.vmware.vim25.ClusterVmReadiness;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterOrchestrationInfo", propOrder = {"defaultVmReadiness"})
public class ClusterOrchestrationInfo extends DynamicData {
  protected ClusterVmReadiness defaultVmReadiness;
  
  public ClusterVmReadiness getDefaultVmReadiness() {
    return this.defaultVmReadiness;
  }
  
  public void setDefaultVmReadiness(ClusterVmReadiness paramClusterVmReadiness) {
    this.defaultVmReadiness = paramClusterVmReadiness;
  }
}
