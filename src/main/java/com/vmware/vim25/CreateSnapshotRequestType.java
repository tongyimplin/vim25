package com.vmware.vim25;

import com.vmware.vim25.CreateSnapshotRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateSnapshotRequestType", propOrder = {"_this", "name", "description", "memory", "quiesce"})
public class CreateSnapshotRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String name;
  
  protected String description;
  
  protected boolean memory;
  
  protected boolean quiesce;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public boolean isMemory() {
    return this.memory;
  }
  
  public void setMemory(boolean paramBoolean) {
    this.memory = paramBoolean;
  }
  
  public boolean isQuiesce() {
    return this.quiesce;
  }
  
  public void setQuiesce(boolean paramBoolean) {
    this.quiesce = paramBoolean;
  }
}
