package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterDpmHostConfigSpec;
import com.vmware.vim25.ClusterDpmHostConfigSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterDpmHostConfigSpec", propOrder = {"clusterDpmHostConfigSpec"})
public class ArrayOfClusterDpmHostConfigSpec {
  @XmlElement(name = "ClusterDpmHostConfigSpec")
  protected List<ClusterDpmHostConfigSpec> clusterDpmHostConfigSpec;
  
  public List<ClusterDpmHostConfigSpec> getClusterDpmHostConfigSpec() {
    if (this.clusterDpmHostConfigSpec == null)
      this.clusterDpmHostConfigSpec = new ArrayList<>(); 
    return this.clusterDpmHostConfigSpec;
  }
}
