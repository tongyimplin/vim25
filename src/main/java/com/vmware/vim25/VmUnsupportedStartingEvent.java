package com.vmware.vim25;

import com.vmware.vim25.VmStartingEvent;
import com.vmware.vim25.VmUnsupportedStartingEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmUnsupportedStartingEvent", propOrder = {"guestId"})
public class VmUnsupportedStartingEvent extends VmStartingEvent {
  @XmlElement(required = true)
  protected String guestId;
  
  public String getGuestId() {
    return this.guestId;
  }
  
  public void setGuestId(String paramString) {
    this.guestId = paramString;
  }
}
