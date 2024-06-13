package com.vmware.vim25;

import com.vmware.vim25.ClusterAffinityRuleSpec;
import com.vmware.vim25.ClusterAntiAffinityRuleSpec;
import com.vmware.vim25.ClusterDependencyRuleInfo;
import com.vmware.vim25.ClusterRuleInfo;
import com.vmware.vim25.ClusterVmHostRuleInfo;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedEntityStatus;
import com.vmware.vim25.VirtualDiskAntiAffinityRuleSpec;
import com.vmware.vim25.VirtualDiskRuleSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterRuleInfo", propOrder = {"key", "status", "enabled", "name", "mandatory", "userCreated", "inCompliance", "ruleUuid"})
@XmlSeeAlso({ClusterDependencyRuleInfo.class, ClusterAffinityRuleSpec.class, ClusterAntiAffinityRuleSpec.class, VirtualDiskRuleSpec.class, VirtualDiskAntiAffinityRuleSpec.class, ClusterVmHostRuleInfo.class})
public class ClusterRuleInfo extends DynamicData {
  protected Integer key;
  
  protected ManagedEntityStatus status;
  
  protected Boolean enabled;
  
  protected String name;
  
  protected Boolean mandatory;
  
  protected Boolean userCreated;
  
  protected Boolean inCompliance;
  
  protected String ruleUuid;
  
  public Integer getKey() {
    return this.key;
  }
  
  public void setKey(Integer paramInteger) {
    this.key = paramInteger;
  }
  
  public ManagedEntityStatus getStatus() {
    return this.status;
  }
  
  public void setStatus(ManagedEntityStatus paramManagedEntityStatus) {
    this.status = paramManagedEntityStatus;
  }
  
  public Boolean isEnabled() {
    return this.enabled;
  }
  
  public void setEnabled(Boolean paramBoolean) {
    this.enabled = paramBoolean;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public Boolean isMandatory() {
    return this.mandatory;
  }
  
  public void setMandatory(Boolean paramBoolean) {
    this.mandatory = paramBoolean;
  }
  
  public Boolean isUserCreated() {
    return this.userCreated;
  }
  
  public void setUserCreated(Boolean paramBoolean) {
    this.userCreated = paramBoolean;
  }
  
  public Boolean isInCompliance() {
    return this.inCompliance;
  }
  
  public void setInCompliance(Boolean paramBoolean) {
    this.inCompliance = paramBoolean;
  }
  
  public String getRuleUuid() {
    return this.ruleUuid;
  }
  
  public void setRuleUuid(String paramString) {
    this.ruleUuid = paramString;
  }
}
