package com.vmware.vim25;

import com.vmware.vim25.ClusterDrsFaults;
import com.vmware.vim25.ClusterRecommendation;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.PlacementResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacementResult", propOrder = {"recommendations", "drsFault"})
public class PlacementResult extends DynamicData {
  protected List<ClusterRecommendation> recommendations;
  
  protected ClusterDrsFaults drsFault;
  
  public List<ClusterRecommendation> getRecommendations() {
    if (this.recommendations == null)
      this.recommendations = new ArrayList<>(); 
    return this.recommendations;
  }
  
  public ClusterDrsFaults getDrsFault() {
    return this.drsFault;
  }
  
  public void setDrsFault(ClusterDrsFaults paramClusterDrsFaults) {
    this.drsFault = paramClusterDrsFaults;
  }
}
