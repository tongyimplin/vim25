package com.vmware.vim25;

import com.vmware.vim25.InvalidProfileReferenceHost;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RuntimeFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidProfileReferenceHost", propOrder = {"reason", "host", "profile", "profileName"})
public class InvalidProfileReferenceHost extends RuntimeFault {
  protected String reason;
  
  protected ManagedObjectReference host;
  
  protected ManagedObjectReference profile;
  
  protected String profileName;
  
  public String getReason() {
    return this.reason;
  }
  
  public void setReason(String paramString) {
    this.reason = paramString;
  }
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getProfile() {
    return this.profile;
  }
  
  public void setProfile(ManagedObjectReference paramManagedObjectReference) {
    this.profile = paramManagedObjectReference;
  }
  
  public String getProfileName() {
    return this.profileName;
  }
  
  public void setProfileName(String paramString) {
    this.profileName = paramString;
  }
}
