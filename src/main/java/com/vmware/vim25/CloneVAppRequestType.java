package com.vmware.vim25;

import com.vmware.vim25.CloneVAppRequestType;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VAppCloneSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CloneVAppRequestType", propOrder = {"_this", "name", "target", "spec"})
public class CloneVAppRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected ManagedObjectReference target;
  
  @XmlElement(required = true)
  protected VAppCloneSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public ManagedObjectReference getTarget() {
    return this.target;
  }
  
  public void setTarget(ManagedObjectReference paramManagedObjectReference) {
    this.target = paramManagedObjectReference;
  }
  
  public VAppCloneSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(VAppCloneSpec paramVAppCloneSpec) {
    this.spec = paramVAppCloneSpec;
  }
}
