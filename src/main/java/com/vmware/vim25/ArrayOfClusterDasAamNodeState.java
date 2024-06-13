package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterDasAamNodeState;
import com.vmware.vim25.ClusterDasAamNodeState;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterDasAamNodeState", propOrder = {"clusterDasAamNodeState"})
public class ArrayOfClusterDasAamNodeState {
  @XmlElement(name = "ClusterDasAamNodeState")
  protected List<ClusterDasAamNodeState> clusterDasAamNodeState;
  
  public List<ClusterDasAamNodeState> getClusterDasAamNodeState() {
    if (this.clusterDasAamNodeState == null)
      this.clusterDasAamNodeState = new ArrayList<>(); 
    return this.clusterDasAamNodeState;
  }
}
