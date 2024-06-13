package com.vmware.vim25;

import com.vmware.vim25.ClusterDrsFaults;
import com.vmware.vim25.ClusterEnterMaintenanceResult;
import com.vmware.vim25.ClusterRecommendation;
import com.vmware.vim25.DynamicData;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterEnterMaintenanceResult", propOrder = {"recommendations", "fault"})
public class ClusterEnterMaintenanceResult extends DynamicData {
  protected List<ClusterRecommendation> recommendations;
  
  protected ClusterDrsFaults fault;
  
  public List<ClusterRecommendation> getRecommendations() {
    if (this.recommendations == null)
      this.recommendations = new ArrayList<>(); 
    return this.recommendations;
  }
  
  public ClusterDrsFaults getFault() {
    return this.fault;
  }
  
  public void setFault(ClusterDrsFaults paramClusterDrsFaults) {
    this.fault = paramClusterDrsFaults;
  }
}
