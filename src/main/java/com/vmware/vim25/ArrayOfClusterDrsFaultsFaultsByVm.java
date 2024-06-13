package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterDrsFaultsFaultsByVm;
import com.vmware.vim25.ClusterDrsFaultsFaultsByVm;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterDrsFaultsFaultsByVm", propOrder = {"clusterDrsFaultsFaultsByVm"})
public class ArrayOfClusterDrsFaultsFaultsByVm {
  @XmlElement(name = "ClusterDrsFaultsFaultsByVm")
  protected List<ClusterDrsFaultsFaultsByVm> clusterDrsFaultsFaultsByVm;
  
  public List<ClusterDrsFaultsFaultsByVm> getClusterDrsFaultsFaultsByVm() {
    if (this.clusterDrsFaultsFaultsByVm == null)
      this.clusterDrsFaultsFaultsByVm = new ArrayList<>(); 
    return this.clusterDrsFaultsFaultsByVm;
  }
}
