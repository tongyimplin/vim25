package com.vmware.vim25;

import com.vmware.vim25.ClusterDasAdmissionControlPolicy;
import com.vmware.vim25.ClusterFailoverHostAdmissionControlPolicy;
import com.vmware.vim25.ClusterFailoverLevelAdmissionControlPolicy;
import com.vmware.vim25.ClusterFailoverResourcesAdmissionControlPolicy;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDasAdmissionControlPolicy", propOrder = {"resourceReductionToToleratePercent"})
@XmlSeeAlso({ClusterFailoverLevelAdmissionControlPolicy.class, ClusterFailoverHostAdmissionControlPolicy.class, ClusterFailoverResourcesAdmissionControlPolicy.class})
public class ClusterDasAdmissionControlPolicy extends DynamicData {
  protected Integer resourceReductionToToleratePercent;
  
  public Integer getResourceReductionToToleratePercent() {
    return this.resourceReductionToToleratePercent;
  }
  
  public void setResourceReductionToToleratePercent(Integer paramInteger) {
    this.resourceReductionToToleratePercent = paramInteger;
  }
}
