package com.vmware.vim25;

import com.vmware.vim25.ClusterVmOrchestrationInfo;
import com.vmware.vim25.ClusterVmReadiness;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterVmOrchestrationInfo", propOrder = {"vm", "vmReadiness"})
public class ClusterVmOrchestrationInfo extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  @XmlElement(required = true)
  protected ClusterVmReadiness vmReadiness;
  
  public ManagedObjectReference getVm() {
    return this.vm;
  }
  
  public void setVm(ManagedObjectReference paramManagedObjectReference) {
    this.vm = paramManagedObjectReference;
  }
  
  public ClusterVmReadiness getVmReadiness() {
    return this.vmReadiness;
  }
  
  public void setVmReadiness(ClusterVmReadiness paramClusterVmReadiness) {
    this.vmReadiness = paramClusterVmReadiness;
  }
}
