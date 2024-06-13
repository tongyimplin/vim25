package com.vmware.vim25;

import com.vmware.vim25.DVSRollbackRequestType;
import com.vmware.vim25.EntityBackupConfig;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSRollbackRequestType", propOrder = {"_this", "entityBackup"})
public class DVSRollbackRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected EntityBackupConfig entityBackup;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public EntityBackupConfig getEntityBackup() {
    return this.entityBackup;
  }
  
  public void setEntityBackup(EntityBackupConfig paramEntityBackupConfig) {
    this.entityBackup = paramEntityBackupConfig;
  }
}
