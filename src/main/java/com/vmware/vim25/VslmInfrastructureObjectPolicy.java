package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.VslmInfrastructureObjectPolicy;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vslmInfrastructureObjectPolicy", propOrder = {"name", "backingObjectId", "profileId", "error"})
public class VslmInfrastructureObjectPolicy extends DynamicData {
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected String backingObjectId;
  
  @XmlElement(required = true)
  protected String profileId;
  
  protected LocalizedMethodFault error;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getBackingObjectId() {
    return this.backingObjectId;
  }
  
  public void setBackingObjectId(String paramString) {
    this.backingObjectId = paramString;
  }
  
  public String getProfileId() {
    return this.profileId;
  }
  
  public void setProfileId(String paramString) {
    this.profileId = paramString;
  }
  
  public LocalizedMethodFault getError() {
    return this.error;
  }
  
  public void setError(LocalizedMethodFault paramLocalizedMethodFault) {
    this.error = paramLocalizedMethodFault;
  }
}
