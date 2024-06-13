package com.vmware.vim25;

import com.vmware.vim25.ClusterDrsConfigInfo;
import com.vmware.vim25.DrsBehavior;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.OptionValue;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDrsConfigInfo", propOrder = {"enabled", "enableVmBehaviorOverrides", "defaultVmBehavior", "vmotionRate", "scaleDescendantsShares", "option"})
public class ClusterDrsConfigInfo extends DynamicData {
  protected Boolean enabled;
  
  protected Boolean enableVmBehaviorOverrides;
  
  protected DrsBehavior defaultVmBehavior;
  
  protected Integer vmotionRate;
  
  protected String scaleDescendantsShares;
  
  protected List<OptionValue> option;
  
  public Boolean isEnabled() {
    return this.enabled;
  }
  
  public void setEnabled(Boolean paramBoolean) {
    this.enabled = paramBoolean;
  }
  
  public Boolean isEnableVmBehaviorOverrides() {
    return this.enableVmBehaviorOverrides;
  }
  
  public void setEnableVmBehaviorOverrides(Boolean paramBoolean) {
    this.enableVmBehaviorOverrides = paramBoolean;
  }
  
  public DrsBehavior getDefaultVmBehavior() {
    return this.defaultVmBehavior;
  }
  
  public void setDefaultVmBehavior(DrsBehavior paramDrsBehavior) {
    this.defaultVmBehavior = paramDrsBehavior;
  }
  
  public Integer getVmotionRate() {
    return this.vmotionRate;
  }
  
  public void setVmotionRate(Integer paramInteger) {
    this.vmotionRate = paramInteger;
  }
  
  public String getScaleDescendantsShares() {
    return this.scaleDescendantsShares;
  }
  
  public void setScaleDescendantsShares(String paramString) {
    this.scaleDescendantsShares = paramString;
  }
  
  public List<OptionValue> getOption() {
    if (this.option == null)
      this.option = new ArrayList<>(); 
    return this.option;
  }
}
