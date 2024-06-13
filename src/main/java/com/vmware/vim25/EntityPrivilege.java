package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.EntityPrivilege;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.PrivilegeAvailability;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityPrivilege", propOrder = {"entity", "privAvailability"})
public class EntityPrivilege extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference entity;
  
  @XmlElement(required = true)
  protected List<PrivilegeAvailability> privAvailability;
  
  public ManagedObjectReference getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedObjectReference paramManagedObjectReference) {
    this.entity = paramManagedObjectReference;
  }
  
  public List<PrivilegeAvailability> getPrivAvailability() {
    if (this.privAvailability == null)
      this.privAvailability = new ArrayList<>(); 
    return this.privAvailability;
  }
}
