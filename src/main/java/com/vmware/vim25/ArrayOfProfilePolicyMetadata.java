package com.vmware.vim25;

import com.vmware.vim25.ArrayOfProfilePolicyMetadata;
import com.vmware.vim25.ProfilePolicyMetadata;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProfilePolicyMetadata", propOrder = {"profilePolicyMetadata"})
public class ArrayOfProfilePolicyMetadata {
  @XmlElement(name = "ProfilePolicyMetadata")
  protected List<ProfilePolicyMetadata> profilePolicyMetadata;
  
  public List<ProfilePolicyMetadata> getProfilePolicyMetadata() {
    if (this.profilePolicyMetadata == null)
      this.profilePolicyMetadata = new ArrayList<>(); 
    return this.profilePolicyMetadata;
  }
}
