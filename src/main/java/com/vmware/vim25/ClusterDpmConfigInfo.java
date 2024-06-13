package com.vmware.vim25;

import com.vmware.vim25.ClusterDpmConfigInfo;
import com.vmware.vim25.DpmBehavior;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.OptionValue;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDpmConfigInfo", propOrder = {"enabled", "defaultDpmBehavior", "hostPowerActionRate", "option"})
public class ClusterDpmConfigInfo extends DynamicData {
  protected Boolean enabled;
  
  protected DpmBehavior defaultDpmBehavior;
  
  protected Integer hostPowerActionRate;
  
  protected List<OptionValue> option;
  
  public Boolean isEnabled() {
    return this.enabled;
  }
  
  public void setEnabled(Boolean paramBoolean) {
    this.enabled = paramBoolean;
  }
  
  public DpmBehavior getDefaultDpmBehavior() {
    return this.defaultDpmBehavior;
  }
  
  public void setDefaultDpmBehavior(DpmBehavior paramDpmBehavior) {
    this.defaultDpmBehavior = paramDpmBehavior;
  }
  
  public Integer getHostPowerActionRate() {
    return this.hostPowerActionRate;
  }
  
  public void setHostPowerActionRate(Integer paramInteger) {
    this.hostPowerActionRate = paramInteger;
  }
  
  public List<OptionValue> getOption() {
    if (this.option == null)
      this.option = new ArrayList<>(); 
    return this.option;
  }
}
