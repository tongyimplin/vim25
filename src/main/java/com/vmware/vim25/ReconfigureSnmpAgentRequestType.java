package com.vmware.vim25;

import com.vmware.vim25.HostSnmpConfigSpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ReconfigureSnmpAgentRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconfigureSnmpAgentRequestType", propOrder = {"_this", "spec"})
public class ReconfigureSnmpAgentRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostSnmpConfigSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostSnmpConfigSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(HostSnmpConfigSpec paramHostSnmpConfigSpec) {
    this.spec = paramHostSnmpConfigSpec;
  }
}
