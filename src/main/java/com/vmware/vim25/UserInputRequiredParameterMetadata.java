package com.vmware.vim25;

import com.vmware.vim25.ProfileParameterMetadata;
import com.vmware.vim25.ProfilePolicyOptionMetadata;
import com.vmware.vim25.UserInputRequiredParameterMetadata;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserInputRequiredParameterMetadata", propOrder = {"userInputParameter"})
public class UserInputRequiredParameterMetadata extends ProfilePolicyOptionMetadata {
  protected List<ProfileParameterMetadata> userInputParameter;
  
  public List<ProfileParameterMetadata> getUserInputParameter() {
    if (this.userInputParameter == null)
      this.userInputParameter = new ArrayList<>(); 
    return this.userInputParameter;
  }
}
