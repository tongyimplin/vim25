package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterDasVmConfigInfo;
import com.vmware.vim25.ClusterDasVmConfigInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterDasVmConfigInfo", propOrder = {"clusterDasVmConfigInfo"})
public class ArrayOfClusterDasVmConfigInfo {
  @XmlElement(name = "ClusterDasVmConfigInfo")
  protected List<ClusterDasVmConfigInfo> clusterDasVmConfigInfo;
  
  public List<ClusterDasVmConfigInfo> getClusterDasVmConfigInfo() {
    if (this.clusterDasVmConfigInfo == null)
      this.clusterDasVmConfigInfo = new ArrayList<>(); 
    return this.clusterDasVmConfigInfo;
  }
}
