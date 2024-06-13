package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterGroupSpec;
import com.vmware.vim25.ClusterGroupSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterGroupSpec", propOrder = {"clusterGroupSpec"})
public class ArrayOfClusterGroupSpec {
  @XmlElement(name = "ClusterGroupSpec")
  protected List<ClusterGroupSpec> clusterGroupSpec;
  
  public List<ClusterGroupSpec> getClusterGroupSpec() {
    if (this.clusterGroupSpec == null)
      this.clusterGroupSpec = new ArrayList<>(); 
    return this.clusterGroupSpec;
  }
}
