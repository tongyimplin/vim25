package com.vmware.vim25;

import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.SetTaskStateRequestType;
import com.vmware.vim25.TaskInfoState;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetTaskStateRequestType", propOrder = {"_this", "state", "result", "fault"})
public class SetTaskStateRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected TaskInfoState state;
  
  protected Object result;
  
  protected LocalizedMethodFault fault;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public TaskInfoState getState() {
    return this.state;
  }
  
  public void setState(TaskInfoState paramTaskInfoState) {
    this.state = paramTaskInfoState;
  }
  
  public Object getResult() {
    return this.result;
  }
  
  public void setResult(Object paramObject) {
    this.result = paramObject;
  }
  
  public LocalizedMethodFault getFault() {
    return this.fault;
  }
  
  public void setFault(LocalizedMethodFault paramLocalizedMethodFault) {
    this.fault = paramLocalizedMethodFault;
  }
}
