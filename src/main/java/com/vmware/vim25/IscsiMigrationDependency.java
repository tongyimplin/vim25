package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.IscsiDependencyEntity;
import com.vmware.vim25.IscsiMigrationDependency;
import com.vmware.vim25.IscsiStatus;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IscsiMigrationDependency", propOrder = {"migrationAllowed", "disallowReason", "dependency"})
public class IscsiMigrationDependency extends DynamicData {
  protected boolean migrationAllowed;
  
  protected IscsiStatus disallowReason;
  
  protected List<IscsiDependencyEntity> dependency;
  
  public boolean isMigrationAllowed() {
    return this.migrationAllowed;
  }
  
  public void setMigrationAllowed(boolean paramBoolean) {
    this.migrationAllowed = paramBoolean;
  }
  
  public IscsiStatus getDisallowReason() {
    return this.disallowReason;
  }
  
  public void setDisallowReason(IscsiStatus paramIscsiStatus) {
    this.disallowReason = paramIscsiStatus;
  }
  
  public List<IscsiDependencyEntity> getDependency() {
    if (this.dependency == null)
      this.dependency = new ArrayList<>(); 
    return this.dependency;
  }
}
