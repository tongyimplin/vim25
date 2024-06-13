package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.PolicyOption;
import com.vmware.vim25.ProfilePolicy;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfilePolicy", propOrder = {"id", "policyOption"})
public class ProfilePolicy extends DynamicData {
  @XmlElement(required = true)
  protected String id;
  
  @XmlElement(required = true)
  protected PolicyOption policyOption;
  
  public String getId() {
    return this.id;
  }
  
  public void setId(String paramString) {
    this.id = paramString;
  }
  
  public PolicyOption getPolicyOption() {
    return this.policyOption;
  }
  
  public void setPolicyOption(PolicyOption paramPolicyOption) {
    this.policyOption = paramPolicyOption;
  }
}
