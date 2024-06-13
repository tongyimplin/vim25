package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ProfileMetadataProfileSortSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileMetadataProfileSortSpec", propOrder = {"policyId", "parameter"})
public class ProfileMetadataProfileSortSpec extends DynamicData {
  @XmlElement(required = true)
  protected String policyId;
  
  @XmlElement(required = true)
  protected String parameter;
  
  public String getPolicyId() {
    return this.policyId;
  }
  
  public void setPolicyId(String paramString) {
    this.policyId = paramString;
  }
  
  public String getParameter() {
    return this.parameter;
  }
  
  public void setParameter(String paramString) {
    this.parameter = paramString;
  }
}
