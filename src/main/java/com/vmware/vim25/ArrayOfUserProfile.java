package com.vmware.vim25;

import com.vmware.vim25.ArrayOfUserProfile;
import com.vmware.vim25.UserProfile;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUserProfile", propOrder = {"userProfile"})
public class ArrayOfUserProfile {
  @XmlElement(name = "UserProfile")
  protected List<UserProfile> userProfile;
  
  public List<UserProfile> getUserProfile() {
    if (this.userProfile == null)
      this.userProfile = new ArrayList<>(); 
    return this.userProfile;
  }
}
