package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterAttemptedVmInfo;
import com.vmware.vim25.ClusterAttemptedVmInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterAttemptedVmInfo", propOrder = {"clusterAttemptedVmInfo"})
public class ArrayOfClusterAttemptedVmInfo {
  @XmlElement(name = "ClusterAttemptedVmInfo")
  protected List<ClusterAttemptedVmInfo> clusterAttemptedVmInfo;
  
  public List<ClusterAttemptedVmInfo> getClusterAttemptedVmInfo() {
    if (this.clusterAttemptedVmInfo == null)
      this.clusterAttemptedVmInfo = new ArrayList<>(); 
    return this.clusterAttemptedVmInfo;
  }
}
