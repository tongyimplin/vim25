package com.vmware.vim25;

import com.vmware.vim25.ClusterDpmHostConfigInfo;
import com.vmware.vim25.DpmBehavior;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDpmHostConfigInfo", propOrder = {"key", "enabled", "behavior"})
public class ClusterDpmHostConfigInfo extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference key;
  
  protected Boolean enabled;
  
  protected DpmBehavior behavior;
  
  public ManagedObjectReference getKey() {
    return this.key;
  }
  
  public void setKey(ManagedObjectReference paramManagedObjectReference) {
    this.key = paramManagedObjectReference;
  }
  
  public Boolean isEnabled() {
    return this.enabled;
  }
  
  public void setEnabled(Boolean paramBoolean) {
    this.enabled = paramBoolean;
  }
  
  public DpmBehavior getBehavior() {
    return this.behavior;
  }
  
  public void setBehavior(DpmBehavior paramDpmBehavior) {
    this.behavior = paramDpmBehavior;
  }
}
