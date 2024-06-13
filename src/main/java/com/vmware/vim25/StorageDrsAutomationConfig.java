package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.StorageDrsAutomationConfig;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageDrsAutomationConfig", propOrder = {"spaceLoadBalanceAutomationMode", "ioLoadBalanceAutomationMode", "ruleEnforcementAutomationMode", "policyEnforcementAutomationMode", "vmEvacuationAutomationMode"})
public class StorageDrsAutomationConfig extends DynamicData {
  protected String spaceLoadBalanceAutomationMode;
  
  protected String ioLoadBalanceAutomationMode;
  
  protected String ruleEnforcementAutomationMode;
  
  protected String policyEnforcementAutomationMode;
  
  protected String vmEvacuationAutomationMode;
  
  public String getSpaceLoadBalanceAutomationMode() {
    return this.spaceLoadBalanceAutomationMode;
  }
  
  public void setSpaceLoadBalanceAutomationMode(String paramString) {
    this.spaceLoadBalanceAutomationMode = paramString;
  }
  
  public String getIoLoadBalanceAutomationMode() {
    return this.ioLoadBalanceAutomationMode;
  }
  
  public void setIoLoadBalanceAutomationMode(String paramString) {
    this.ioLoadBalanceAutomationMode = paramString;
  }
  
  public String getRuleEnforcementAutomationMode() {
    return this.ruleEnforcementAutomationMode;
  }
  
  public void setRuleEnforcementAutomationMode(String paramString) {
    this.ruleEnforcementAutomationMode = paramString;
  }
  
  public String getPolicyEnforcementAutomationMode() {
    return this.policyEnforcementAutomationMode;
  }
  
  public void setPolicyEnforcementAutomationMode(String paramString) {
    this.policyEnforcementAutomationMode = paramString;
  }
  
  public String getVmEvacuationAutomationMode() {
    return this.vmEvacuationAutomationMode;
  }
  
  public void setVmEvacuationAutomationMode(String paramString) {
    this.vmEvacuationAutomationMode = paramString;
  }
}
