package com.vmware.vim25;

import com.vmware.vim25.PosixUserSearchResult;
import com.vmware.vim25.UserSearchResult;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PosixUserSearchResult", propOrder = {"id", "shellAccess"})
public class PosixUserSearchResult extends UserSearchResult {
  protected int id;
  
  protected Boolean shellAccess;
  
  public int getId() {
    return this.id;
  }
  
  public void setId(int paramInt) {
    this.id = paramInt;
  }
  
  public Boolean isShellAccess() {
    return this.shellAccess;
  }
  
  public void setShellAccess(Boolean paramBoolean) {
    this.shellAccess = paramBoolean;
  }
}
