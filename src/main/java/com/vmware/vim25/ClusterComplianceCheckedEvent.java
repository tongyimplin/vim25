package com.vmware.vim25;

import com.vmware.vim25.ClusterComplianceCheckedEvent;
import com.vmware.vim25.ClusterEvent;
import com.vmware.vim25.ProfileEventArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterComplianceCheckedEvent", propOrder = {"profile"})
public class ClusterComplianceCheckedEvent extends ClusterEvent {
  @XmlElement(required = true)
  protected ProfileEventArgument profile;
  
  public ProfileEventArgument getProfile() {
    return this.profile;
  }
  
  public void setProfile(ProfileEventArgument paramProfileEventArgument) {
    this.profile = paramProfileEventArgument;
  }
}
