package com.vmware.vim25;

import com.vmware.vim25.HostComplianceCheckedEvent;
import com.vmware.vim25.HostEvent;
import com.vmware.vim25.ProfileEventArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostComplianceCheckedEvent", propOrder = {"profile"})
public class HostComplianceCheckedEvent extends HostEvent {
  @XmlElement(required = true)
  protected ProfileEventArgument profile;
  
  public ProfileEventArgument getProfile() {
    return this.profile;
  }
  
  public void setProfile(ProfileEventArgument paramProfileEventArgument) {
    this.profile = paramProfileEventArgument;
  }
}
