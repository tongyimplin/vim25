package com.vmware.vim25;

import com.vmware.vim25.Event;
import com.vmware.vim25.ProfileAssociatedEvent;
import com.vmware.vim25.ProfileChangedEvent;
import com.vmware.vim25.ProfileCreatedEvent;
import com.vmware.vim25.ProfileDissociatedEvent;
import com.vmware.vim25.ProfileEvent;
import com.vmware.vim25.ProfileEventArgument;
import com.vmware.vim25.ProfileReferenceHostChangedEvent;
import com.vmware.vim25.ProfileRemovedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileEvent", propOrder = {"profile"})
@XmlSeeAlso({ProfileAssociatedEvent.class, ProfileRemovedEvent.class, ProfileChangedEvent.class, ProfileCreatedEvent.class, ProfileDissociatedEvent.class, ProfileReferenceHostChangedEvent.class})
public class ProfileEvent extends Event {
  @XmlElement(required = true)
  protected ProfileEventArgument profile;
  
  public ProfileEventArgument getProfile() {
    return this.profile;
  }
  
  public void setProfile(ProfileEventArgument paramProfileEventArgument) {
    this.profile = paramProfileEventArgument;
  }
}
