package com.vmware.vim25;

import com.vmware.vim25.EVCAdmissionFailed;
import com.vmware.vim25.EVCAdmissionFailedCPUFeaturesForMode;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EVCAdmissionFailedCPUFeaturesForMode", propOrder = {"currentEVCModeKey"})
public class EVCAdmissionFailedCPUFeaturesForMode extends EVCAdmissionFailed {
  @XmlElement(required = true)
  protected String currentEVCModeKey;
  
  public String getCurrentEVCModeKey() {
    return this.currentEVCModeKey;
  }
  
  public void setCurrentEVCModeKey(String paramString) {
    this.currentEVCModeKey = paramString;
  }
}
