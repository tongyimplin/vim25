package com.vmware.vim25;

import com.vmware.vim25.ProfileCompositePolicyOptionMetadata;
import com.vmware.vim25.ProfilePolicyOptionMetadata;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileCompositePolicyOptionMetadata", propOrder = {"option"})
public class ProfileCompositePolicyOptionMetadata extends ProfilePolicyOptionMetadata {
  @XmlElement(required = true)
  protected List<String> option;
  
  public List<String> getOption() {
    if (this.option == null)
      this.option = new ArrayList<>(); 
    return this.option;
  }
}
