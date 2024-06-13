package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RetrieveUserGroupsRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveUserGroupsRequestType", propOrder = {"_this", "domain", "searchStr", "belongsToGroup", "belongsToUser", "exactMatch", "findUsers", "findGroups"})
public class RetrieveUserGroupsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected String domain;
  
  @XmlElement(required = true)
  protected String searchStr;
  
  protected String belongsToGroup;
  
  protected String belongsToUser;
  
  protected boolean exactMatch;
  
  protected boolean findUsers;
  
  protected boolean findGroups;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getDomain() {
    return this.domain;
  }
  
  public void setDomain(String paramString) {
    this.domain = paramString;
  }
  
  public String getSearchStr() {
    return this.searchStr;
  }
  
  public void setSearchStr(String paramString) {
    this.searchStr = paramString;
  }
  
  public String getBelongsToGroup() {
    return this.belongsToGroup;
  }
  
  public void setBelongsToGroup(String paramString) {
    this.belongsToGroup = paramString;
  }
  
  public String getBelongsToUser() {
    return this.belongsToUser;
  }
  
  public void setBelongsToUser(String paramString) {
    this.belongsToUser = paramString;
  }
  
  public boolean isExactMatch() {
    return this.exactMatch;
  }
  
  public void setExactMatch(boolean paramBoolean) {
    this.exactMatch = paramBoolean;
  }
  
  public boolean isFindUsers() {
    return this.findUsers;
  }
  
  public void setFindUsers(boolean paramBoolean) {
    this.findUsers = paramBoolean;
  }
  
  public boolean isFindGroups() {
    return this.findGroups;
  }
  
  public void setFindGroups(boolean paramBoolean) {
    this.findGroups = paramBoolean;
  }
}
