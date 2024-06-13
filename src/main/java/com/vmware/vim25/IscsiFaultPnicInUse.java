package com.vmware.vim25;

import com.vmware.vim25.IscsiFault;
import com.vmware.vim25.IscsiFaultPnicInUse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IscsiFaultPnicInUse", propOrder = {"pnicDevice"})
public class IscsiFaultPnicInUse extends IscsiFault {
  @XmlElement(required = true)
  protected String pnicDevice;
  
  public String getPnicDevice() {
    return this.pnicDevice;
  }
  
  public void setPnicDevice(String paramString) {
    this.pnicDevice = paramString;
  }
}
