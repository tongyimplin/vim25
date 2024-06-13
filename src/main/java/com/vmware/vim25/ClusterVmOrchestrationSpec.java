package com.vmware.vim25;

import com.vmware.vim25.ArrayUpdateSpec;
import com.vmware.vim25.ClusterVmOrchestrationInfo;
import com.vmware.vim25.ClusterVmOrchestrationSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterVmOrchestrationSpec", propOrder = {"info"})
public class ClusterVmOrchestrationSpec extends ArrayUpdateSpec {
  protected ClusterVmOrchestrationInfo info;
  
  public ClusterVmOrchestrationInfo getInfo() {
    return this.info;
  }
  
  public void setInfo(ClusterVmOrchestrationInfo paramClusterVmOrchestrationInfo) {
    this.info = paramClusterVmOrchestrationInfo;
  }
}
