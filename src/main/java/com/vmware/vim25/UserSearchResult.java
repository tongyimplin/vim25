package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.PosixUserSearchResult;
import com.vmware.vim25.UserSearchResult;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserSearchResult", propOrder = {"principal", "fullName", "group"})
@XmlSeeAlso({PosixUserSearchResult.class})
public class UserSearchResult extends DynamicData {
  @XmlElement(required = true)
  protected String principal;
  
  protected String fullName;
  
  protected boolean group;
  
  public String getPrincipal() {
    return this.principal;
  }
  
  public void setPrincipal(String paramString) {
    this.principal = paramString;
  }
  
  public String getFullName() {
    return this.fullName;
  }
  
  public void setFullName(String paramString) {
    this.fullName = paramString;
  }
  
  public boolean isGroup() {
    return this.group;
  }
  
  public void setGroup(boolean paramBoolean) {
    this.group = paramBoolean;
  }
}
