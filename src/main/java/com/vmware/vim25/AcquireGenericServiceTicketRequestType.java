package com.vmware.vim25;

import com.vmware.vim25.AcquireGenericServiceTicketRequestType;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.SessionManagerServiceRequestSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcquireGenericServiceTicketRequestType", propOrder = {"_this", "spec"})
public class AcquireGenericServiceTicketRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected SessionManagerServiceRequestSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public SessionManagerServiceRequestSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(SessionManagerServiceRequestSpec paramSessionManagerServiceRequestSpec) {
    this.spec = paramSessionManagerServiceRequestSpec;
  }
}
