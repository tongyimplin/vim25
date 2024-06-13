package com.vmware.vim25;

import com.vmware.vim25.AuthorizationPrivilege;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorizationPrivilege", propOrder = {"privId", "onParent", "name", "privGroupName"})
public class AuthorizationPrivilege extends DynamicData {
  @XmlElement(required = true)
  protected String privId;
  
  protected boolean onParent;
  
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected String privGroupName;
  
  public String getPrivId() {
    return this.privId;
  }
  
  public void setPrivId(String paramString) {
    this.privId = paramString;
  }
  
  public boolean isOnParent() {
    return this.onParent;
  }
  
  public void setOnParent(boolean paramBoolean) {
    this.onParent = paramBoolean;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getPrivGroupName() {
    return this.privGroupName;
  }
  
  public void setPrivGroupName(String paramString) {
    this.privGroupName = paramString;
  }
}
