package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.PlacementAffinityRule;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacementAffinityRule", propOrder = {"ruleType", "ruleScope", "vms", "keys"})
public class PlacementAffinityRule extends DynamicData {
  @XmlElement(required = true)
  protected String ruleType;
  
  @XmlElement(required = true)
  protected String ruleScope;
  
  protected List<ManagedObjectReference> vms;
  
  protected List<String> keys;
  
  public String getRuleType() {
    return this.ruleType;
  }
  
  public void setRuleType(String paramString) {
    this.ruleType = paramString;
  }
  
  public String getRuleScope() {
    return this.ruleScope;
  }
  
  public void setRuleScope(String paramString) {
    this.ruleScope = paramString;
  }
  
  public List<ManagedObjectReference> getVms() {
    if (this.vms == null)
      this.vms = new ArrayList<>(); 
    return this.vms;
  }
  
  public List<String> getKeys() {
    if (this.keys == null)
      this.keys = new ArrayList<>(); 
    return this.keys;
  }
}
