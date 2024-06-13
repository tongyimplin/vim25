package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterHostRecommendation;
import com.vmware.vim25.ClusterHostRecommendation;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterHostRecommendation", propOrder = {"clusterHostRecommendation"})
public class ArrayOfClusterHostRecommendation {
  @XmlElement(name = "ClusterHostRecommendation")
  protected List<ClusterHostRecommendation> clusterHostRecommendation;
  
  public List<ClusterHostRecommendation> getClusterHostRecommendation() {
    if (this.clusterHostRecommendation == null)
      this.clusterHostRecommendation = new ArrayList<>(); 
    return this.clusterHostRecommendation;
  }
}
