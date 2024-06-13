package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterAction;
import com.vmware.vim25.ClusterAction;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterAction", propOrder = {"clusterAction"})
public class ArrayOfClusterAction {
  @XmlElement(name = "ClusterAction")
  protected List<ClusterAction> clusterAction;
  
  public List<ClusterAction> getClusterAction() {
    if (this.clusterAction == null)
      this.clusterAction = new ArrayList<>(); 
    return this.clusterAction;
  }
}
