package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RegisterVMRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterVMRequestType", propOrder = {"_this", "path", "name", "asTemplate", "pool", "host"})
public class RegisterVMRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String path;
  
  protected String name;
  
  protected boolean asTemplate;
  
  protected ManagedObjectReference pool;
  
  protected ManagedObjectReference host;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getPath() {
    return this.path;
  }
  
  public void setPath(String paramString) {
    this.path = paramString;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public boolean isAsTemplate() {
    return this.asTemplate;
  }
  
  public void setAsTemplate(boolean paramBoolean) {
    this.asTemplate = paramBoolean;
  }
  
  public ManagedObjectReference getPool() {
    return this.pool;
  }
  
  public void setPool(ManagedObjectReference paramManagedObjectReference) {
    this.pool = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
}
