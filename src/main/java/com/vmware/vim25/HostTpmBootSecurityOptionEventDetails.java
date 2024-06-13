package com.vmware.vim25;

import com.vmware.vim25.HostTpmBootSecurityOptionEventDetails;
import com.vmware.vim25.HostTpmEventDetails;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostTpmBootSecurityOptionEventDetails", propOrder = {"bootSecurityOption"})
public class HostTpmBootSecurityOptionEventDetails extends HostTpmEventDetails {
  @XmlElement(required = true)
  protected String bootSecurityOption;
  
  public String getBootSecurityOption() {
    return this.bootSecurityOption;
  }
  
  public void setBootSecurityOption(String paramString) {
    this.bootSecurityOption = paramString;
  }
}
