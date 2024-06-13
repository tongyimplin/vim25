package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterDrsVmConfigInfo;
import com.vmware.vim25.ClusterDrsVmConfigInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterDrsVmConfigInfo", propOrder = {"clusterDrsVmConfigInfo"})
public class ArrayOfClusterDrsVmConfigInfo {
  @XmlElement(name = "ClusterDrsVmConfigInfo")
  protected List<ClusterDrsVmConfigInfo> clusterDrsVmConfigInfo;
  
  public List<ClusterDrsVmConfigInfo> getClusterDrsVmConfigInfo() {
    if (this.clusterDrsVmConfigInfo == null)
      this.clusterDrsVmConfigInfo = new ArrayList<>(); 
    return this.clusterDrsVmConfigInfo;
  }
}
