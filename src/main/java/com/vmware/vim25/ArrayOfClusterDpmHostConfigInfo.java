package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterDpmHostConfigInfo;
import com.vmware.vim25.ClusterDpmHostConfigInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterDpmHostConfigInfo", propOrder = {"clusterDpmHostConfigInfo"})
public class ArrayOfClusterDpmHostConfigInfo {
  @XmlElement(name = "ClusterDpmHostConfigInfo")
  protected List<ClusterDpmHostConfigInfo> clusterDpmHostConfigInfo;
  
  public List<ClusterDpmHostConfigInfo> getClusterDpmHostConfigInfo() {
    if (this.clusterDpmHostConfigInfo == null)
      this.clusterDpmHostConfigInfo = new ArrayList<>(); 
    return this.clusterDpmHostConfigInfo;
  }
}
