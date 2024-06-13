package com.vmware.vim25;

import com.vmware.vim25.ClusterAttemptedVmInfo;
import com.vmware.vim25.ClusterNotAttemptedVmInfo;
import com.vmware.vim25.ClusterPowerOnVmResult;
import com.vmware.vim25.ClusterRecommendation;
import com.vmware.vim25.DynamicData;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterPowerOnVmResult", propOrder = {"attempted", "notAttempted", "recommendations"})
public class ClusterPowerOnVmResult extends DynamicData {
  protected List<ClusterAttemptedVmInfo> attempted;
  
  protected List<ClusterNotAttemptedVmInfo> notAttempted;
  
  protected List<ClusterRecommendation> recommendations;
  
  public List<ClusterAttemptedVmInfo> getAttempted() {
    if (this.attempted == null)
      this.attempted = new ArrayList<>(); 
    return this.attempted;
  }
  
  public List<ClusterNotAttemptedVmInfo> getNotAttempted() {
    if (this.notAttempted == null)
      this.notAttempted = new ArrayList<>(); 
    return this.notAttempted;
  }
  
  public List<ClusterRecommendation> getRecommendations() {
    if (this.recommendations == null)
      this.recommendations = new ArrayList<>(); 
    return this.recommendations;
  }
}
