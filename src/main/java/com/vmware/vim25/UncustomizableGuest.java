package com.vmware.vim25;

import com.vmware.vim25.CustomizationFault;
import com.vmware.vim25.UncustomizableGuest;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UncustomizableGuest", propOrder = {"uncustomizableGuestOS"})
public class UncustomizableGuest extends CustomizationFault {
  @XmlElement(required = true)
  protected String uncustomizableGuestOS;
  
  public String getUncustomizableGuestOS() {
    return this.uncustomizableGuestOS;
  }
  
  public void setUncustomizableGuestOS(String paramString) {
    this.uncustomizableGuestOS = paramString;
  }
}
