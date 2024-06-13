package com.vmware.vim25;

import com.vmware.vim25.AddAuthorizationRoleRequestType;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddAuthorizationRoleRequestType", propOrder = {"_this", "name", "privIds"})
public class AddAuthorizationRoleRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String name;
  
  protected List<String> privIds;
  
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
  
  public List<String> getPrivIds() {
    if (this.privIds == null)
      this.privIds = new ArrayList<>(); 
    return this.privIds;
  }
}
