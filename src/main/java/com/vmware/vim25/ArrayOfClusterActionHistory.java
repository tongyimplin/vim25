package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterActionHistory;
import com.vmware.vim25.ClusterActionHistory;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterActionHistory", propOrder = {"clusterActionHistory"})
public class ArrayOfClusterActionHistory {
  @XmlElement(name = "ClusterActionHistory")
  protected List<ClusterActionHistory> clusterActionHistory;
  
  public List<ClusterActionHistory> getClusterActionHistory() {
    if (this.clusterActionHistory == null)
      this.clusterActionHistory = new ArrayList<>(); 
    return this.clusterActionHistory;
  }
}
