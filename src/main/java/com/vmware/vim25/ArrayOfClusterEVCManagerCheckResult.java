package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterEVCManagerCheckResult;
import com.vmware.vim25.ClusterEVCManagerCheckResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterEVCManagerCheckResult", propOrder = {"clusterEVCManagerCheckResult"})
public class ArrayOfClusterEVCManagerCheckResult {
  @XmlElement(name = "ClusterEVCManagerCheckResult")
  protected List<ClusterEVCManagerCheckResult> clusterEVCManagerCheckResult;
  
  public List<ClusterEVCManagerCheckResult> getClusterEVCManagerCheckResult() {
    if (this.clusterEVCManagerCheckResult == null)
      this.clusterEVCManagerCheckResult = new ArrayList<>(); 
    return this.clusterEVCManagerCheckResult;
  }
}
