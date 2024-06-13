package com.vmware.vim25;

import com.vmware.vim25.ClusterResourceUsageSummary;
import com.vmware.vim25.GetResourceUsageResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "GetResourceUsageResponse")
public class GetResourceUsageResponse {
  @XmlElement(required = true)
  protected ClusterResourceUsageSummary returnval;
  
  public ClusterResourceUsageSummary getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(ClusterResourceUsageSummary paramClusterResourceUsageSummary) {
    this.returnval = paramClusterResourceUsageSummary;
  }
}
