package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostEsxAgentHostManagerConfigInfo;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostEsxAgentHostManagerConfigInfo", propOrder = {"agentVmDatastore", "agentVmNetwork"})
public class HostEsxAgentHostManagerConfigInfo extends DynamicData {
  protected ManagedObjectReference agentVmDatastore;
  
  protected ManagedObjectReference agentVmNetwork;
  
  public ManagedObjectReference getAgentVmDatastore() {
    return this.agentVmDatastore;
  }
  
  public void setAgentVmDatastore(ManagedObjectReference paramManagedObjectReference) {
    this.agentVmDatastore = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getAgentVmNetwork() {
    return this.agentVmNetwork;
  }
  
  public void setAgentVmNetwork(ManagedObjectReference paramManagedObjectReference) {
    this.agentVmNetwork = paramManagedObjectReference;
  }
}
