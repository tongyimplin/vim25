package com.vmware.vim25;

import com.vmware.vim25.HostDasEvent;
import com.vmware.vim25.HostShortNameInconsistentEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostShortNameInconsistentEvent", propOrder = {"shortName", "shortName2"})
public class HostShortNameInconsistentEvent extends HostDasEvent {
  @XmlElement(required = true)
  protected String shortName;
  
  @XmlElement(required = true)
  protected String shortName2;
  
  public String getShortName() {
    return this.shortName;
  }
  
  public void setShortName(String paramString) {
    this.shortName = paramString;
  }
  
  public String getShortName2() {
    return this.shortName2;
  }
  
  public void setShortName2(String paramString) {
    this.shortName2 = paramString;
  }
}
