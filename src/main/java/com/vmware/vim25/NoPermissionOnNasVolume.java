package com.vmware.vim25;

import com.vmware.vim25.NasConfigFault;
import com.vmware.vim25.NoPermissionOnNasVolume;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoPermissionOnNasVolume", propOrder = {"userName"})
public class NoPermissionOnNasVolume extends NasConfigFault {
  protected String userName;
  
  public String getUserName() {
    return this.userName;
  }
  
  public void setUserName(String paramString) {
    this.userName = paramString;
  }
}
