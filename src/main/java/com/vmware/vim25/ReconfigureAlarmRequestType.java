package com.vmware.vim25;

import com.vmware.vim25.AlarmSpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ReconfigureAlarmRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconfigureAlarmRequestType", propOrder = {"_this", "spec"})
public class ReconfigureAlarmRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected AlarmSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public AlarmSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(AlarmSpec paramAlarmSpec) {
    this.spec = paramAlarmSpec;
  }
}
