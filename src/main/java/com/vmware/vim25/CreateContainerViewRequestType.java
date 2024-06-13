package com.vmware.vim25;

import com.vmware.vim25.CreateContainerViewRequestType;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateContainerViewRequestType", propOrder = {"_this", "container", "type", "recursive"})
public class CreateContainerViewRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference container;
  
  protected List<String> type;
  
  protected boolean recursive;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getContainer() {
    return this.container;
  }
  
  public void setContainer(ManagedObjectReference paramManagedObjectReference) {
    this.container = paramManagedObjectReference;
  }
  
  public List<String> getType() {
    if (this.type == null)
      this.type = new ArrayList<>(); 
    return this.type;
  }
  
  public boolean isRecursive() {
    return this.recursive;
  }
  
  public void setRecursive(boolean paramBoolean) {
    this.recursive = paramBoolean;
  }
}
