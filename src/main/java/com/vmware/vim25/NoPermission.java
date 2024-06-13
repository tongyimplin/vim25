package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.NoPermission;
import com.vmware.vim25.NotAuthenticated;
import com.vmware.vim25.SecurityError;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoPermission", propOrder = {"object", "privilegeId"})
@XmlSeeAlso({NotAuthenticated.class})
public class NoPermission extends SecurityError {
  @XmlElement(required = true)
  protected ManagedObjectReference object;
  
  @XmlElement(required = true)
  protected String privilegeId;
  
  public ManagedObjectReference getObject() {
    return this.object;
  }
  
  public void setObject(ManagedObjectReference paramManagedObjectReference) {
    this.object = paramManagedObjectReference;
  }
  
  public String getPrivilegeId() {
    return this.privilegeId;
  }
  
  public void setPrivilegeId(String paramString) {
    this.privilegeId = paramString;
  }
}
