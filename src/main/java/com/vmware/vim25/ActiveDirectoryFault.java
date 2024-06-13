package com.vmware.vim25;

import com.vmware.vim25.ActiveDirectoryFault;
import com.vmware.vim25.DomainNotFound;
import com.vmware.vim25.InvalidCAMServer;
import com.vmware.vim25.NoPermissionOnAD;
import com.vmware.vim25.NonADUserRequired;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActiveDirectoryFault", propOrder = {"errorCode"})
@XmlSeeAlso({DomainNotFound.class, InvalidCAMServer.class, NoPermissionOnAD.class, NonADUserRequired.class})
public class ActiveDirectoryFault extends VimFault {
  protected Integer errorCode;
  
  public Integer getErrorCode() {
    return this.errorCode;
  }
  
  public void setErrorCode(Integer paramInteger) {
    this.errorCode = paramInteger;
  }
}
