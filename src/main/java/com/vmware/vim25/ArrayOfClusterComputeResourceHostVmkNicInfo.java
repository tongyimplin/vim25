package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterComputeResourceHostVmkNicInfo;
import com.vmware.vim25.ClusterComputeResourceHostVmkNicInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterComputeResourceHostVmkNicInfo", propOrder = {"clusterComputeResourceHostVmkNicInfo"})
public class ArrayOfClusterComputeResourceHostVmkNicInfo {
  @XmlElement(name = "ClusterComputeResourceHostVmkNicInfo")
  protected List<ClusterComputeResourceHostVmkNicInfo> clusterComputeResourceHostVmkNicInfo;
  
  public List<ClusterComputeResourceHostVmkNicInfo> getClusterComputeResourceHostVmkNicInfo() {
    if (this.clusterComputeResourceHostVmkNicInfo == null)
      this.clusterComputeResourceHostVmkNicInfo = new ArrayList<>(); 
    return this.clusterComputeResourceHostVmkNicInfo;
  }
}
