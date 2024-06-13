package com.vmware.vim25;

import com.vmware.vim25.ArrayOfProfilePolicyOptionMetadata;
import com.vmware.vim25.ProfilePolicyOptionMetadata;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProfilePolicyOptionMetadata", propOrder = {"profilePolicyOptionMetadata"})
public class ArrayOfProfilePolicyOptionMetadata {
  @XmlElement(name = "ProfilePolicyOptionMetadata")
  protected List<ProfilePolicyOptionMetadata> profilePolicyOptionMetadata;
  
  public List<ProfilePolicyOptionMetadata> getProfilePolicyOptionMetadata() {
    if (this.profilePolicyOptionMetadata == null)
      this.profilePolicyOptionMetadata = new ArrayList<>(); 
    return this.profilePolicyOptionMetadata;
  }
}
