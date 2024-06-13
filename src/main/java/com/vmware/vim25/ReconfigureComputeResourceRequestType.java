package com.vmware.vim25;

import com.vmware.vim25.ComputeResourceConfigSpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ReconfigureComputeResourceRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconfigureComputeResourceRequestType", propOrder = {"_this", "spec", "modify"})
public class ReconfigureComputeResourceRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ComputeResourceConfigSpec spec;
  
  protected boolean modify;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ComputeResourceConfigSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(ComputeResourceConfigSpec paramComputeResourceConfigSpec) {
    this.spec = paramComputeResourceConfigSpec;
  }
  
  public boolean isModify() {
    return this.modify;
  }
  
  public void setModify(boolean paramBoolean) {
    this.modify = paramBoolean;
  }
}
