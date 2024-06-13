package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterComputeResourceDVSSettingDVPortgroupToServiceMapping;
import com.vmware.vim25.ClusterComputeResourceDVSSettingDVPortgroupToServiceMapping;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterComputeResourceDVSSettingDVPortgroupToServiceMapping", propOrder = {"clusterComputeResourceDVSSettingDVPortgroupToServiceMapping"})
public class ArrayOfClusterComputeResourceDVSSettingDVPortgroupToServiceMapping {
  @XmlElement(name = "ClusterComputeResourceDVSSettingDVPortgroupToServiceMapping")
  protected List<ClusterComputeResourceDVSSettingDVPortgroupToServiceMapping> clusterComputeResourceDVSSettingDVPortgroupToServiceMapping;
  
  public List<ClusterComputeResourceDVSSettingDVPortgroupToServiceMapping> getClusterComputeResourceDVSSettingDVPortgroupToServiceMapping() {
    if (this.clusterComputeResourceDVSSettingDVPortgroupToServiceMapping == null)
      this.clusterComputeResourceDVSSettingDVPortgroupToServiceMapping = new ArrayList<>(); 
    return this.clusterComputeResourceDVSSettingDVPortgroupToServiceMapping;
  }
}
