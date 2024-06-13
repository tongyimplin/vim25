package com.vmware.vim25;

import com.vmware.vim25.HostNasVolumeUserInfo;
import com.vmware.vim25.QueryNFSUserResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryNFSUserResponse")
public class QueryNFSUserResponse {
  protected HostNasVolumeUserInfo returnval;
  
  public HostNasVolumeUserInfo getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(HostNasVolumeUserInfo paramHostNasVolumeUserInfo) {
    this.returnval = paramHostNasVolumeUserInfo;
  }
}
