package com.vmware.vim25;

import com.vmware.vim25.CustomizationEvent;
import com.vmware.vim25.CustomizationFailed;
import com.vmware.vim25.CustomizationStartedEvent;
import com.vmware.vim25.CustomizationSucceeded;
import com.vmware.vim25.VmEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationEvent", propOrder = {"logLocation"})
@XmlSeeAlso({CustomizationStartedEvent.class, CustomizationSucceeded.class, CustomizationFailed.class})
public class CustomizationEvent extends VmEvent {
  protected String logLocation;
  
  public String getLogLocation() {
    return this.logLocation;
  }
  
  public void setLogLocation(String paramString) {
    this.logLocation = paramString;
  }
}
