package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterComputeResourceDvsProfileDVPortgroupSpecToServiceMapping;
import com.vmware.vim25.ClusterComputeResourceDvsProfileDVPortgroupSpecToServiceMapping;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterComputeResourceDvsProfileDVPortgroupSpecToServiceMapping", propOrder = {"clusterComputeResourceDvsProfileDVPortgroupSpecToServiceMapping"})
public class ArrayOfClusterComputeResourceDvsProfileDVPortgroupSpecToServiceMapping {
  @XmlElement(name = "ClusterComputeResourceDvsProfileDVPortgroupSpecToServiceMapping")
  protected List<ClusterComputeResourceDvsProfileDVPortgroupSpecToServiceMapping> clusterComputeResourceDvsProfileDVPortgroupSpecToServiceMapping;
  
  public List<ClusterComputeResourceDvsProfileDVPortgroupSpecToServiceMapping> getClusterComputeResourceDvsProfileDVPortgroupSpecToServiceMapping() {
    if (this.clusterComputeResourceDvsProfileDVPortgroupSpecToServiceMapping == null)
      this.clusterComputeResourceDvsProfileDVPortgroupSpecToServiceMapping = new ArrayList<>(); 
    return this.clusterComputeResourceDvsProfileDVPortgroupSpecToServiceMapping;
  }
}
