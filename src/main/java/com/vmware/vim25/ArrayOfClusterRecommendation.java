package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterRecommendation;
import com.vmware.vim25.ClusterRecommendation;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterRecommendation", propOrder = {"clusterRecommendation"})
public class ArrayOfClusterRecommendation {
  @XmlElement(name = "ClusterRecommendation")
  protected List<ClusterRecommendation> clusterRecommendation;
  
  public List<ClusterRecommendation> getClusterRecommendation() {
    if (this.clusterRecommendation == null)
      this.clusterRecommendation = new ArrayList<>(); 
    return this.clusterRecommendation;
  }
}
