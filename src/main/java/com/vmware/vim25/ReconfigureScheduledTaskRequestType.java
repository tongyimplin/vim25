package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ReconfigureScheduledTaskRequestType;
import com.vmware.vim25.ScheduledTaskSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconfigureScheduledTaskRequestType", propOrder = {"_this", "spec"})
public class ReconfigureScheduledTaskRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ScheduledTaskSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ScheduledTaskSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(ScheduledTaskSpec paramScheduledTaskSpec) {
    this.spec = paramScheduledTaskSpec;
  }
}
