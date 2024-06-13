package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterComputeResourceDVSSetting;
import com.vmware.vim25.ClusterComputeResourceDVSSetting;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterComputeResourceDVSSetting", propOrder = {"clusterComputeResourceDVSSetting"})
public class ArrayOfClusterComputeResourceDVSSetting {
  @XmlElement(name = "ClusterComputeResourceDVSSetting")
  protected List<ClusterComputeResourceDVSSetting> clusterComputeResourceDVSSetting;
  
  public List<ClusterComputeResourceDVSSetting> getClusterComputeResourceDVSSetting() {
    if (this.clusterComputeResourceDVSSetting == null)
      this.clusterComputeResourceDVSSetting = new ArrayList<>(); 
    return this.clusterComputeResourceDVSSetting;
  }
}
