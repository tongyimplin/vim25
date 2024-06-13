package com.vmware.vim25;

import com.vmware.vim25.ExecuteHostProfileRequestType;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ProfileDeferredPolicyOptionParameter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecuteHostProfileRequestType", propOrder = {"_this", "host", "deferredParam"})
public class ExecuteHostProfileRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  protected List<ProfileDeferredPolicyOptionParameter> deferredParam;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public List<ProfileDeferredPolicyOptionParameter> getDeferredParam() {
    if (this.deferredParam == null)
      this.deferredParam = new ArrayList<>(); 
    return this.deferredParam;
  }
}
