package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterComputeResourceValidationResultBase;
import com.vmware.vim25.ClusterComputeResourceValidationResultBase;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterComputeResourceValidationResultBase", propOrder = {"clusterComputeResourceValidationResultBase"})
public class ArrayOfClusterComputeResourceValidationResultBase {
  @XmlElement(name = "ClusterComputeResourceValidationResultBase")
  protected List<ClusterComputeResourceValidationResultBase> clusterComputeResourceValidationResultBase;
  
  public List<ClusterComputeResourceValidationResultBase> getClusterComputeResourceValidationResultBase() {
    if (this.clusterComputeResourceValidationResultBase == null)
      this.clusterComputeResourceValidationResultBase = new ArrayList<>(); 
    return this.clusterComputeResourceValidationResultBase;
  }
}
