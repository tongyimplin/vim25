package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterDasVmConfigSpec;
import com.vmware.vim25.ClusterDasVmConfigSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterDasVmConfigSpec", propOrder = {"clusterDasVmConfigSpec"})
public class ArrayOfClusterDasVmConfigSpec {
  @XmlElement(name = "ClusterDasVmConfigSpec")
  protected List<ClusterDasVmConfigSpec> clusterDasVmConfigSpec;
  
  public List<ClusterDasVmConfigSpec> getClusterDasVmConfigSpec() {
    if (this.clusterDasVmConfigSpec == null)
      this.clusterDasVmConfigSpec = new ArrayList<>(); 
    return this.clusterDasVmConfigSpec;
  }
}
