package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UserPrivilegeResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserPrivilegeResult", propOrder = {"entity", "privileges"})
public class UserPrivilegeResult extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference entity;
  
  protected List<String> privileges;
  
  public ManagedObjectReference getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedObjectReference paramManagedObjectReference) {
    this.entity = paramManagedObjectReference;
  }
  
  public List<String> getPrivileges() {
    if (this.privileges == null)
      this.privileges = new ArrayList<>(); 
    return this.privileges;
  }
}
