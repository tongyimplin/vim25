package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VmFaultToleranceConfigIssue;
import com.vmware.vim25.VmFaultToleranceIssue;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmFaultToleranceConfigIssue", propOrder = {"reason", "entityName", "entity"})
public class VmFaultToleranceConfigIssue extends VmFaultToleranceIssue {
  protected String reason;
  
  protected String entityName;
  
  protected ManagedObjectReference entity;
  
  public String getReason() {
    return this.reason;
  }
  
  public void setReason(String paramString) {
    this.reason = paramString;
  }
  
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
}
