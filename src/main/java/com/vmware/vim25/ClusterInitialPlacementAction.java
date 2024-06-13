package com.vmware.vim25;

import com.vmware.vim25.ClusterAction;
import com.vmware.vim25.ClusterInitialPlacementAction;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterInitialPlacementAction", propOrder = {"targetHost", "pool"})
public class ClusterInitialPlacementAction extends ClusterAction {
  @XmlElement(required = true)
  protected ManagedObjectReference targetHost;
  
  protected ManagedObjectReference pool;
  
  public ManagedObjectReference getTargetHost() {
    return this.targetHost;
  }
  
  public void setTargetHost(ManagedObjectReference paramManagedObjectReference) {
    this.targetHost = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getPool() {
    return this.pool;
  }
  
  public void setPool(ManagedObjectReference paramManagedObjectReference) {
    this.pool = paramManagedObjectReference;
  }
}
