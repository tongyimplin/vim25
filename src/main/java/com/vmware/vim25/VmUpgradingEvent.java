package com.vmware.vim25;

import com.vmware.vim25.VmEvent;
import com.vmware.vim25.VmUpgradingEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmUpgradingEvent", propOrder = {"version"})
public class VmUpgradingEvent extends VmEvent {
  @XmlElement(required = true)
  protected String version;
  
  public String getVersion() {
    return this.version;
  }
  
  public void setVersion(String paramString) {
    this.version = paramString;
  }
}
