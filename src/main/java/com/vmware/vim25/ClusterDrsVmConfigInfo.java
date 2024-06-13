package com.vmware.vim25;

import com.vmware.vim25.ClusterDrsVmConfigInfo;
import com.vmware.vim25.DrsBehavior;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDrsVmConfigInfo", propOrder = {"key", "enabled", "behavior"})
public class ClusterDrsVmConfigInfo extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference key;
  
  protected Boolean enabled;
  
  protected DrsBehavior behavior;
  
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
  
  public DrsBehavior getBehavior() {
    return this.behavior;
  }
  
  public void setBehavior(DrsBehavior paramDrsBehavior) {
    this.behavior = paramDrsBehavior;
  }
}
