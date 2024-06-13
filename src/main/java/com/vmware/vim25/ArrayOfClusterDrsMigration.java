package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterDrsMigration;
import com.vmware.vim25.ClusterDrsMigration;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterDrsMigration", propOrder = {"clusterDrsMigration"})
public class ArrayOfClusterDrsMigration {
  @XmlElement(name = "ClusterDrsMigration")
  protected List<ClusterDrsMigration> clusterDrsMigration;
  
  public List<ClusterDrsMigration> getClusterDrsMigration() {
    if (this.clusterDrsMigration == null)
      this.clusterDrsMigration = new ArrayList<>(); 
    return this.clusterDrsMigration;
  }
}
