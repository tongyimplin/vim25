package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterDrsVmConfigSpec;
import com.vmware.vim25.ClusterDrsVmConfigSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterDrsVmConfigSpec", propOrder = {"clusterDrsVmConfigSpec"})
public class ArrayOfClusterDrsVmConfigSpec {
  @XmlElement(name = "ClusterDrsVmConfigSpec")
  protected List<ClusterDrsVmConfigSpec> clusterDrsVmConfigSpec;
  
  public List<ClusterDrsVmConfigSpec> getClusterDrsVmConfigSpec() {
    if (this.clusterDrsVmConfigSpec == null)
      this.clusterDrsVmConfigSpec = new ArrayList<>(); 
    return this.clusterDrsVmConfigSpec;
  }
}
