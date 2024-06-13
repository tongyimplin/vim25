package com.vmware.vim25;

import com.vmware.vim25.ClusterHostRecommendation;
import com.vmware.vim25.RecommendHostsForVmResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "RecommendHostsForVmResponse")
public class RecommendHostsForVmResponse {
  protected List<ClusterHostRecommendation> returnval;
  
  public List<ClusterHostRecommendation> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
