package com.vmware.vim25;

import com.vmware.vim25.DatacenterConfigSpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ReconfigureDatacenterRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconfigureDatacenterRequestType", propOrder = {"_this", "spec", "modify"})
public class ReconfigureDatacenterRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected DatacenterConfigSpec spec;
  
  protected boolean modify;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public DatacenterConfigSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(DatacenterConfigSpec paramDatacenterConfigSpec) {
    this.spec = paramDatacenterConfigSpec;
  }
  
  public boolean isModify() {
    return this.modify;
  }
  
  public void setModify(boolean paramBoolean) {
    this.modify = paramBoolean;
  }
}
