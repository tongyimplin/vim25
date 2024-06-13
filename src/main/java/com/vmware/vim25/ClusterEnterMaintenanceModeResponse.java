package com.vmware.vim25;

import com.vmware.vim25.ClusterEnterMaintenanceModeResponse;
import com.vmware.vim25.ClusterEnterMaintenanceResult;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "ClusterEnterMaintenanceModeResponse")
public class ClusterEnterMaintenanceModeResponse {
  @XmlElement(required = true)
  protected ClusterEnterMaintenanceResult returnval;
  
  public ClusterEnterMaintenanceResult getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(ClusterEnterMaintenanceResult paramClusterEnterMaintenanceResult) {
    this.returnval = paramClusterEnterMaintenanceResult;
  }
}
