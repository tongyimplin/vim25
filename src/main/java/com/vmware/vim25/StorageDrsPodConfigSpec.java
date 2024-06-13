package com.vmware.vim25;

import com.vmware.vim25.ClusterRuleSpec;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.StorageDrsAutomationConfig;
import com.vmware.vim25.StorageDrsIoLoadBalanceConfig;
import com.vmware.vim25.StorageDrsOptionSpec;
import com.vmware.vim25.StorageDrsPodConfigSpec;
import com.vmware.vim25.StorageDrsSpaceLoadBalanceConfig;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageDrsPodConfigSpec", propOrder = {"enabled", "ioLoadBalanceEnabled", "defaultVmBehavior", "loadBalanceInterval", "defaultIntraVmAffinity", "spaceLoadBalanceConfig", "ioLoadBalanceConfig", "automationOverrides", "rule", "option"})
public class StorageDrsPodConfigSpec extends DynamicData {
  protected Boolean enabled;
  
  protected Boolean ioLoadBalanceEnabled;
  
  protected String defaultVmBehavior;
  
  protected Integer loadBalanceInterval;
  
  protected Boolean defaultIntraVmAffinity;
  
  protected StorageDrsSpaceLoadBalanceConfig spaceLoadBalanceConfig;
  
  protected StorageDrsIoLoadBalanceConfig ioLoadBalanceConfig;
  
  protected StorageDrsAutomationConfig automationOverrides;
  
  protected List<ClusterRuleSpec> rule;
  
  protected List<StorageDrsOptionSpec> option;
  
  public Boolean isEnabled() {
    return this.enabled;
  }
  
  public void setEnabled(Boolean paramBoolean) {
    this.enabled = paramBoolean;
  }
  
  public Boolean isIoLoadBalanceEnabled() {
    return this.ioLoadBalanceEnabled;
  }
  
  public void setIoLoadBalanceEnabled(Boolean paramBoolean) {
    this.ioLoadBalanceEnabled = paramBoolean;
  }
  
  public String getDefaultVmBehavior() {
    return this.defaultVmBehavior;
  }
  
  public void setDefaultVmBehavior(String paramString) {
    this.defaultVmBehavior = paramString;
  }
  
  public Integer getLoadBalanceInterval() {
    return this.loadBalanceInterval;
  }
  
  public void setLoadBalanceInterval(Integer paramInteger) {
    this.loadBalanceInterval = paramInteger;
  }
  
  public Boolean isDefaultIntraVmAffinity() {
    return this.defaultIntraVmAffinity;
  }
  
  public void setDefaultIntraVmAffinity(Boolean paramBoolean) {
    this.defaultIntraVmAffinity = paramBoolean;
  }
  
  public StorageDrsSpaceLoadBalanceConfig getSpaceLoadBalanceConfig() {
    return this.spaceLoadBalanceConfig;
  }
  
  public void setSpaceLoadBalanceConfig(StorageDrsSpaceLoadBalanceConfig paramStorageDrsSpaceLoadBalanceConfig) {
    this.spaceLoadBalanceConfig = paramStorageDrsSpaceLoadBalanceConfig;
  }
  
  public StorageDrsIoLoadBalanceConfig getIoLoadBalanceConfig() {
    return this.ioLoadBalanceConfig;
  }
  
  public void setIoLoadBalanceConfig(StorageDrsIoLoadBalanceConfig paramStorageDrsIoLoadBalanceConfig) {
    this.ioLoadBalanceConfig = paramStorageDrsIoLoadBalanceConfig;
  }
  
  public StorageDrsAutomationConfig getAutomationOverrides() {
    return this.automationOverrides;
  }
  
  public void setAutomationOverrides(StorageDrsAutomationConfig paramStorageDrsAutomationConfig) {
    this.automationOverrides = paramStorageDrsAutomationConfig;
  }
  
  public List<ClusterRuleSpec> getRule() {
    if (this.rule == null)
      this.rule = new ArrayList<>(); 
    return this.rule;
  }
  
  public List<StorageDrsOptionSpec> getOption() {
    if (this.option == null)
      this.option = new ArrayList<>(); 
    return this.option;
  }
}
