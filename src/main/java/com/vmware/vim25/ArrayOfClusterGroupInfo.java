package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterGroupInfo;
import com.vmware.vim25.ClusterGroupInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterGroupInfo", propOrder = {"clusterGroupInfo"})
public class ArrayOfClusterGroupInfo {
  @XmlElement(name = "ClusterGroupInfo")
  protected List<ClusterGroupInfo> clusterGroupInfo;
  
  public List<ClusterGroupInfo> getClusterGroupInfo() {
    if (this.clusterGroupInfo == null)
      this.clusterGroupInfo = new ArrayList<>(); 
    return this.clusterGroupInfo;
  }
}
