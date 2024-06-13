package com.vmware.vim25;

import com.vmware.vim25.ClusterComputeResourceVCProfile;
import com.vmware.vim25.ClusterConfigSpecEx;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterComputeResourceVCProfile", propOrder = {"clusterSpec", "evcModeKey"})
public class ClusterComputeResourceVCProfile extends DynamicData {
  protected ClusterConfigSpecEx clusterSpec;
  
  protected String evcModeKey;
  
  public ClusterConfigSpecEx getClusterSpec() {
    return this.clusterSpec;
  }
  
  public void setClusterSpec(ClusterConfigSpecEx paramClusterConfigSpecEx) {
    this.clusterSpec = paramClusterConfigSpecEx;
  }
  
  public String getEvcModeKey() {
    return this.evcModeKey;
  }
  
  public void setEvcModeKey(String paramString) {
    this.evcModeKey = paramString;
  }
}
