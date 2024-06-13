package com.vmware.vim25;

import com.vmware.vim25.ArrayOfUserGroupProfile;
import com.vmware.vim25.UserGroupProfile;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUserGroupProfile", propOrder = {"userGroupProfile"})
public class ArrayOfUserGroupProfile {
  @XmlElement(name = "UserGroupProfile")
  protected List<UserGroupProfile> userGroupProfile;
  
  public List<UserGroupProfile> getUserGroupProfile() {
    if (this.userGroupProfile == null)
      this.userGroupProfile = new ArrayList<>(); 
    return this.userGroupProfile;
  }
}
