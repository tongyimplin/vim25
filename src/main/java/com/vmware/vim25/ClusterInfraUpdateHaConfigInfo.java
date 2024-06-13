package com.vmware.vim25;

import com.vmware.vim25.ClusterInfraUpdateHaConfigInfo;
import com.vmware.vim25.DynamicData;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterInfraUpdateHaConfigInfo", propOrder = {"enabled", "behavior", "moderateRemediation", "severeRemediation", "providers"})
public class ClusterInfraUpdateHaConfigInfo extends DynamicData {
  protected Boolean enabled;
  
  protected String behavior;
  
  protected String moderateRemediation;
  
  protected String severeRemediation;
  
  protected List<String> providers;
  
  public Boolean isEnabled() {
    return this.enabled;
  }
  
  public void setEnabled(Boolean paramBoolean) {
    this.enabled = paramBoolean;
  }
  
  public String getBehavior() {
    return this.behavior;
  }
  
  public void setBehavior(String paramString) {
    this.behavior = paramString;
  }
  
  public String getModerateRemediation() {
    return this.moderateRemediation;
  }
  
  public void setModerateRemediation(String paramString) {
    this.moderateRemediation = paramString;
  }
  
  public String getSevereRemediation() {
    return this.severeRemediation;
  }
  
  public void setSevereRemediation(String paramString) {
    this.severeRemediation = paramString;
  }
  
  public List<String> getProviders() {
    if (this.providers == null)
      this.providers = new ArrayList<>(); 
    return this.providers;
  }
}
