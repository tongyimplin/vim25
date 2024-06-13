package com.vmware.vim25;

import com.vmware.vim25.ArrayOfUserPrivilegeResult;
import com.vmware.vim25.UserPrivilegeResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUserPrivilegeResult", propOrder = {"userPrivilegeResult"})
public class ArrayOfUserPrivilegeResult {
  @XmlElement(name = "UserPrivilegeResult")
  protected List<UserPrivilegeResult> userPrivilegeResult;
  
  public List<UserPrivilegeResult> getUserPrivilegeResult() {
    if (this.userPrivilegeResult == null)
      this.userPrivilegeResult = new ArrayList<>(); 
    return this.userPrivilegeResult;
  }
}
