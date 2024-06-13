package com.vmware.vim25;

import com.vmware.vim25.ClusterActionHistory;
import com.vmware.vim25.ClusterDrsFaults;
import com.vmware.vim25.ClusterRecommendation;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.PodStorageDrsEntry;
import com.vmware.vim25.StorageDrsConfigInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PodStorageDrsEntry", propOrder = {"storageDrsConfig", "recommendation", "drsFault", "actionHistory"})
public class PodStorageDrsEntry extends DynamicData {
  @XmlElement(required = true)
  protected StorageDrsConfigInfo storageDrsConfig;
  
  protected List<ClusterRecommendation> recommendation;
  
  protected List<ClusterDrsFaults> drsFault;
  
  protected List<ClusterActionHistory> actionHistory;
  
  public StorageDrsConfigInfo getStorageDrsConfig() {
    return this.storageDrsConfig;
  }
  
  public void setStorageDrsConfig(StorageDrsConfigInfo paramStorageDrsConfigInfo) {
    this.storageDrsConfig = paramStorageDrsConfigInfo;
  }
  
  public List<ClusterRecommendation> getRecommendation() {
    if (this.recommendation == null)
      this.recommendation = new ArrayList<>(); 
    return this.recommendation;
  }
  
  public List<ClusterDrsFaults> getDrsFault() {
    if (this.drsFault == null)
      this.drsFault = new ArrayList<>(); 
    return this.drsFault;
  }
  
  public List<ClusterActionHistory> getActionHistory() {
    if (this.actionHistory == null)
      this.actionHistory = new ArrayList<>(); 
    return this.actionHistory;
  }
}
