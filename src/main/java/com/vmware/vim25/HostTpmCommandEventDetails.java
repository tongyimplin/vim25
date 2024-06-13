package com.vmware.vim25;

import com.vmware.vim25.HostTpmCommandEventDetails;
import com.vmware.vim25.HostTpmEventDetails;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostTpmCommandEventDetails", propOrder = {"commandLine"})
public class HostTpmCommandEventDetails extends HostTpmEventDetails {
  @XmlElement(required = true)
  protected String commandLine;
  
  public String getCommandLine() {
    return this.commandLine;
  }
  
  public void setCommandLine(String paramString) {
    this.commandLine = paramString;
  }
}
