package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterComputeResourceHostConfigurationInput;
import com.vmware.vim25.ClusterComputeResourceHostConfigurationInput;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterComputeResourceHostConfigurationInput", propOrder = {"clusterComputeResourceHostConfigurationInput"})
public class ArrayOfClusterComputeResourceHostConfigurationInput {
  @XmlElement(name = "ClusterComputeResourceHostConfigurationInput")
  protected List<ClusterComputeResourceHostConfigurationInput> clusterComputeResourceHostConfigurationInput;
  
  public List<ClusterComputeResourceHostConfigurationInput> getClusterComputeResourceHostConfigurationInput() {
    if (this.clusterComputeResourceHostConfigurationInput == null)
      this.clusterComputeResourceHostConfigurationInput = new ArrayList<>(); 
    return this.clusterComputeResourceHostConfigurationInput;
  }
}
