package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.StorageDrsConfigSpec;
import com.vmware.vim25.ValidateStoragePodConfigRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateStoragePodConfigRequestType", propOrder = {"_this", "pod", "spec"})
public class ValidateStoragePodConfigRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference pod;
  
  @XmlElement(required = true)
  protected StorageDrsConfigSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getPod() {
    return this.pod;
  }
  
  public void setPod(ManagedObjectReference paramManagedObjectReference) {
    this.pod = paramManagedObjectReference;
  }
  
  public StorageDrsConfigSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(StorageDrsConfigSpec paramStorageDrsConfigSpec) {
    this.spec = paramStorageDrsConfigSpec;
  }
}
