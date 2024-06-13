package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ProfilePropertyPath;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfilePropertyPath", propOrder = {"profilePath", "policyId", "parameterId", "policyOptionId"})
public class ProfilePropertyPath extends DynamicData {
  @XmlElement(required = true)
  protected String profilePath;
  
  protected String policyId;
  
  protected String parameterId;
  
  protected String policyOptionId;
  
  public String getProfilePath() {
    return this.profilePath;
  }
  
  public void setProfilePath(String paramString) {
    this.profilePath = paramString;
  }
  
  public String getPolicyId() {
    return this.policyId;
  }
  
  public void setPolicyId(String paramString) {
    this.policyId = paramString;
  }
  
  public String getParameterId() {
    return this.parameterId;
  }
  
  public void setParameterId(String paramString) {
    this.parameterId = paramString;
  }
  
  public String getPolicyOptionId() {
    return this.policyOptionId;
  }
  
  public void setPolicyOptionId(String paramString) {
    this.policyOptionId = paramString;
  }
}
