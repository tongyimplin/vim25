package com.vmware.vim25;

import com.vmware.vim25.FetchUserPrivilegeOnEntitiesResponse;
import com.vmware.vim25.UserPrivilegeResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "FetchUserPrivilegeOnEntitiesResponse")
public class FetchUserPrivilegeOnEntitiesResponse {
  protected List<UserPrivilegeResult> returnval;
  
  public List<UserPrivilegeResult> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
