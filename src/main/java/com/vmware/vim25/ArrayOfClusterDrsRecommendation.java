package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterDrsRecommendation;
import com.vmware.vim25.ClusterDrsRecommendation;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterDrsRecommendation", propOrder = {"clusterDrsRecommendation"})
public class ArrayOfClusterDrsRecommendation {
  @XmlElement(name = "ClusterDrsRecommendation")
  protected List<ClusterDrsRecommendation> clusterDrsRecommendation;
  
  public List<ClusterDrsRecommendation> getClusterDrsRecommendation() {
    if (this.clusterDrsRecommendation == null)
      this.clusterDrsRecommendation = new ArrayList<>(); 
    return this.clusterDrsRecommendation;
  }
}
