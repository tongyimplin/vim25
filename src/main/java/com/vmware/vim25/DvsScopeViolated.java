package com.vmware.vim25;

import com.vmware.vim25.DvsFault;
import com.vmware.vim25.DvsScopeViolated;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsScopeViolated", propOrder = {"scope", "entity"})
public class DvsScopeViolated extends DvsFault {
  @XmlElement(required = true)
  protected List<ManagedObjectReference> scope;
  
  @XmlElement(required = true)
  protected ManagedObjectReference entity;
  
  public List<ManagedObjectReference> getScope() {
    if (this.scope == null)
      this.scope = new ArrayList<>(); 
    return this.scope;
  }
  
  public ManagedObjectReference getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedObjectReference paramManagedObjectReference) {
    this.entity = paramManagedObjectReference;
  }
}
