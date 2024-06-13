package com.vmware.vim25;

import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VmFaultToleranceConfigIssueWrapper;
import com.vmware.vim25.VmFaultToleranceIssue;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmFaultToleranceConfigIssueWrapper", propOrder = {"entityName", "entity", "error"})
public class VmFaultToleranceConfigIssueWrapper extends VmFaultToleranceIssue {
  protected String entityName;
  
  protected ManagedObjectReference entity;
  
  protected LocalizedMethodFault error;
  
  public String getEntityName() {
    return this.entityName;
  }
  
  public void setEntityName(String paramString) {
    this.entityName = paramString;
  }
  
  public ManagedObjectReference getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedObjectReference paramManagedObjectReference) {
    this.entity = paramManagedObjectReference;
  }
  
  public LocalizedMethodFault getError() {
    return this.error;
  }
  
  public void setError(LocalizedMethodFault paramLocalizedMethodFault) {
    this.error = paramLocalizedMethodFault;
  }
}
