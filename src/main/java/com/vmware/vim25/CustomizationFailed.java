package com.vmware.vim25;

import com.vmware.vim25.CustomizationEvent;
import com.vmware.vim25.CustomizationFailed;
import com.vmware.vim25.CustomizationLinuxIdentityFailed;
import com.vmware.vim25.CustomizationNetworkSetupFailed;
import com.vmware.vim25.CustomizationSysprepFailed;
import com.vmware.vim25.CustomizationUnknownFailure;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationFailed", propOrder = {"reason"})
@XmlSeeAlso({CustomizationNetworkSetupFailed.class, CustomizationSysprepFailed.class, CustomizationUnknownFailure.class, CustomizationLinuxIdentityFailed.class})
public class CustomizationFailed extends CustomizationEvent {
  protected String reason;
  
  public String getReason() {
    return this.reason;
  }
  
  public void setReason(String paramString) {
    this.reason = paramString;
  }
}
