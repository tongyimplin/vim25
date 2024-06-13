package com.vmware.vim25;

import com.vmware.vim25.DVSManagerImportEntityRequestType;
import com.vmware.vim25.EntityBackupConfig;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSManagerImportEntityRequestType", propOrder = {"_this", "entityBackup", "importType"})
public class DVSManagerImportEntityRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected List<EntityBackupConfig> entityBackup;
  
  @XmlElement(required = true)
  protected String importType;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<EntityBackupConfig> getEntityBackup() {
    if (this.entityBackup == null)
      this.entityBackup = new ArrayList<>(); 
    return this.entityBackup;
  }
  
  public String getImportType() {
    return this.importType;
  }
  
  public void setImportType(String paramString) {
    this.importType = paramString;
  }
}
