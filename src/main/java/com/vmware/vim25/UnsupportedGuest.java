package com.vmware.vim25;

import com.vmware.vim25.InvalidVmConfig;
import com.vmware.vim25.UnsupportedGuest;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnsupportedGuest", propOrder = {"unsupportedGuestOS"})
public class UnsupportedGuest extends InvalidVmConfig {
  @XmlElement(required = true)
  protected String unsupportedGuestOS;
  
  public String getUnsupportedGuestOS() {
    return this.unsupportedGuestOS;
  }
  
  public void setUnsupportedGuestOS(String paramString) {
    this.unsupportedGuestOS = paramString;
  }
}
