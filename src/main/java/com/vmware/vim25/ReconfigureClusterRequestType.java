package com.vmware.vim25;

import com.vmware.vim25.ClusterConfigSpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ReconfigureClusterRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconfigureClusterRequestType", propOrder = {"_this", "spec", "modify"})
public class ReconfigureClusterRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ClusterConfigSpec spec;
  
  protected boolean modify;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ClusterConfigSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(ClusterConfigSpec paramClusterConfigSpec) {
    this.spec = paramClusterConfigSpec;
  }
  
  public boolean isModify() {
    return this.modify;
  }
  
  public void setModify(boolean paramBoolean) {
    this.modify = paramBoolean;
  }
}
