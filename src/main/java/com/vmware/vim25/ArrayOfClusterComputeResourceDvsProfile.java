package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterComputeResourceDvsProfile;
import com.vmware.vim25.ClusterComputeResourceDvsProfile;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterComputeResourceDvsProfile", propOrder = {"clusterComputeResourceDvsProfile"})
public class ArrayOfClusterComputeResourceDvsProfile {
  @XmlElement(name = "ClusterComputeResourceDvsProfile")
  protected List<ClusterComputeResourceDvsProfile> clusterComputeResourceDvsProfile;
  
  public List<ClusterComputeResourceDvsProfile> getClusterComputeResourceDvsProfile() {
    if (this.clusterComputeResourceDvsProfile == null)
      this.clusterComputeResourceDvsProfile = new ArrayList<>(); 
    return this.clusterComputeResourceDvsProfile;
  }
}
