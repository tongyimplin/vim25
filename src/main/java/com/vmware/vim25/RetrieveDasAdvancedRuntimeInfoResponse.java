package com.vmware.vim25;

import com.vmware.vim25.ClusterDasAdvancedRuntimeInfo;
import com.vmware.vim25.RetrieveDasAdvancedRuntimeInfoResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "RetrieveDasAdvancedRuntimeInfoResponse")
public class RetrieveDasAdvancedRuntimeInfoResponse {
  protected ClusterDasAdvancedRuntimeInfo returnval;
  
  public ClusterDasAdvancedRuntimeInfo getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(ClusterDasAdvancedRuntimeInfo paramClusterDasAdvancedRuntimeInfo) {
    this.returnval = paramClusterDasAdvancedRuntimeInfo;
  }
}
