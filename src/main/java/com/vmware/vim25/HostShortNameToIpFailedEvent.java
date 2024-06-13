package com.vmware.vim25;

import com.vmware.vim25.HostEvent;
import com.vmware.vim25.HostShortNameToIpFailedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostShortNameToIpFailedEvent", propOrder = {"shortName"})
public class HostShortNameToIpFailedEvent extends HostEvent {
  @XmlElement(required = true)
  protected String shortName;
  
  public String getShortName() {
    return this.shortName;
  }
  
  public void setShortName(String paramString) {
    this.shortName = paramString;
  }
}
