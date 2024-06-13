package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterDrsFaults;
import com.vmware.vim25.ClusterDrsFaults;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterDrsFaults", propOrder = {"clusterDrsFaults"})
public class ArrayOfClusterDrsFaults {
  @XmlElement(name = "ClusterDrsFaults")
  protected List<ClusterDrsFaults> clusterDrsFaults;
  
  public List<ClusterDrsFaults> getClusterDrsFaults() {
    if (this.clusterDrsFaults == null)
      this.clusterDrsFaults = new ArrayList<>(); 
    return this.clusterDrsFaults;
  }
}
