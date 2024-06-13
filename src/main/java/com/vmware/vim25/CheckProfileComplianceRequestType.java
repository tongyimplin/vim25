package com.vmware.vim25;

import com.vmware.vim25.CheckProfileComplianceRequestType;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckProfileComplianceRequestType", propOrder = {"_this", "entity"})
public class CheckProfileComplianceRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<ManagedObjectReference> entity;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<ManagedObjectReference> getEntity() {
    if (this.entity == null)
      this.entity = new ArrayList<>(); 
    return this.entity;
  }
}
