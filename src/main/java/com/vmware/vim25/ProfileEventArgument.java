package com.vmware.vim25;

import com.vmware.vim25.EventArgument;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ProfileEventArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileEventArgument", propOrder = {"profile", "name"})
public class ProfileEventArgument extends EventArgument {
  @XmlElement(required = true)
  protected ManagedObjectReference profile;
  
  @XmlElement(required = true)
  protected String name;
  
  public ManagedObjectReference getProfile() {
    return this.profile;
  }
  
  public void setProfile(ManagedObjectReference paramManagedObjectReference) {
    this.profile = paramManagedObjectReference;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
}
