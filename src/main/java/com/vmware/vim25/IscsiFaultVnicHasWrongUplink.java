package com.vmware.vim25;

import com.vmware.vim25.IscsiFault;
import com.vmware.vim25.IscsiFaultVnicHasWrongUplink;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IscsiFaultVnicHasWrongUplink", propOrder = {"vnicDevice"})
public class IscsiFaultVnicHasWrongUplink extends IscsiFault {
  @XmlElement(required = true)
  protected String vnicDevice;
  
  public String getVnicDevice() {
    return this.vnicDevice;
  }
  
  public void setVnicDevice(String paramString) {
    this.vnicDevice = paramString;
  }
}
