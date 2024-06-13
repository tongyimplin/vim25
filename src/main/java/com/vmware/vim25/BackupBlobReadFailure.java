package com.vmware.vim25;

import com.vmware.vim25.BackupBlobReadFailure;
import com.vmware.vim25.DvsFault;
import com.vmware.vim25.LocalizedMethodFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BackupBlobReadFailure", propOrder = {"entityName", "entityType", "fault"})
public class BackupBlobReadFailure extends DvsFault {
  @XmlElement(required = true)
  protected String entityName;
  
  @XmlElement(required = true)
  protected String entityType;
  
  @XmlElement(required = true)
  protected LocalizedMethodFault fault;
  
  public String getEntityName() {
    return this.entityName;
  }
  
  public void setEntityName(String paramString) {
    this.entityName = paramString;
  }
  
  public String getEntityType() {
    return this.entityType;
  }
  
  public void setEntityType(String paramString) {
    this.entityType = paramString;
  }
  
  public LocalizedMethodFault getFault() {
    return this.fault;
  }
  
  public void setFault(LocalizedMethodFault paramLocalizedMethodFault) {
    this.fault = paramLocalizedMethodFault;
  }
}
