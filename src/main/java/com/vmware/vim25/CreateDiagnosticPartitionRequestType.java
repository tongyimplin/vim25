package com.vmware.vim25;

import com.vmware.vim25.CreateDiagnosticPartitionRequestType;
import com.vmware.vim25.HostDiagnosticPartitionCreateSpec;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateDiagnosticPartitionRequestType", propOrder = {"_this", "spec"})
public class CreateDiagnosticPartitionRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostDiagnosticPartitionCreateSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostDiagnosticPartitionCreateSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(HostDiagnosticPartitionCreateSpec paramHostDiagnosticPartitionCreateSpec) {
    this.spec = paramHostDiagnosticPartitionCreateSpec;
  }
}
