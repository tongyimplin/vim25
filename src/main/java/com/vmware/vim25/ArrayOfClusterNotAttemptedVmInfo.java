package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterNotAttemptedVmInfo;
import com.vmware.vim25.ClusterNotAttemptedVmInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterNotAttemptedVmInfo", propOrder = {"clusterNotAttemptedVmInfo"})
public class ArrayOfClusterNotAttemptedVmInfo {
  @XmlElement(name = "ClusterNotAttemptedVmInfo")
  protected List<ClusterNotAttemptedVmInfo> clusterNotAttemptedVmInfo;
  
  public List<ClusterNotAttemptedVmInfo> getClusterNotAttemptedVmInfo() {
    if (this.clusterNotAttemptedVmInfo == null)
      this.clusterNotAttemptedVmInfo = new ArrayList<>(); 
    return this.clusterNotAttemptedVmInfo;
  }
}
