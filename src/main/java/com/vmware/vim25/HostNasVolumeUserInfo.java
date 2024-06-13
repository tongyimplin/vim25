package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostNasVolumeUserInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNasVolumeUserInfo", propOrder = {"user"})
public class HostNasVolumeUserInfo extends DynamicData {
  @XmlElement(required = true)
  protected String user;
  
  public String getUser() {
    return this.user;
  }
  
  public void setUser(String paramString) {
    this.user = paramString;
  }
}
