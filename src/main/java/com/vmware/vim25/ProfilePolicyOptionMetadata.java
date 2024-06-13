package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ExtendedElementDescription;
import com.vmware.vim25.ProfileCompositePolicyOptionMetadata;
import com.vmware.vim25.ProfileParameterMetadata;
import com.vmware.vim25.ProfilePolicyOptionMetadata;
import com.vmware.vim25.UserInputRequiredParameterMetadata;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfilePolicyOptionMetadata", propOrder = {"id", "parameter"})
@XmlSeeAlso({UserInputRequiredParameterMetadata.class, ProfileCompositePolicyOptionMetadata.class})
public class ProfilePolicyOptionMetadata extends DynamicData {
  @XmlElement(required = true)
  protected ExtendedElementDescription id;
  
  protected List<ProfileParameterMetadata> parameter;
  
  public ExtendedElementDescription getId() {
    return this.id;
  }
  
  public void setId(ExtendedElementDescription paramExtendedElementDescription) {
    this.id = paramExtendedElementDescription;
  }
  
  public List<ProfileParameterMetadata> getParameter() {
    if (this.parameter == null)
      this.parameter = new ArrayList<>(); 
    return this.parameter;
  }
}
