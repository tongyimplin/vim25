package com.vmware.vim25;

import com.vmware.vim25.RetrieveUserGroupsResponse;
import com.vmware.vim25.UserSearchResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "RetrieveUserGroupsResponse")
public class RetrieveUserGroupsResponse {
  protected List<UserSearchResult> returnval;
  
  public List<UserSearchResult> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
