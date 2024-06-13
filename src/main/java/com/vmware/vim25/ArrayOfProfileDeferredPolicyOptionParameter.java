package com.vmware.vim25;

import com.vmware.vim25.ArrayOfProfileDeferredPolicyOptionParameter;
import com.vmware.vim25.ProfileDeferredPolicyOptionParameter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProfileDeferredPolicyOptionParameter", propOrder = {"profileDeferredPolicyOptionParameter"})
public class ArrayOfProfileDeferredPolicyOptionParameter {
  @XmlElement(name = "ProfileDeferredPolicyOptionParameter")
  protected List<ProfileDeferredPolicyOptionParameter> profileDeferredPolicyOptionParameter;
  
  public List<ProfileDeferredPolicyOptionParameter> getProfileDeferredPolicyOptionParameter() {
    if (this.profileDeferredPolicyOptionParameter == null)
      this.profileDeferredPolicyOptionParameter = new ArrayList<>(); 
    return this.profileDeferredPolicyOptionParameter;
  }
}
