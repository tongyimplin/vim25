package com.vmware.vim25;

import com.vmware.vim25.HostAccountSpec;
import com.vmware.vim25.HostPosixAccountSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPosixAccountSpec", propOrder = {"posixId", "shellAccess"})
public class HostPosixAccountSpec extends HostAccountSpec {
  protected Integer posixId;
  
  protected Boolean shellAccess;
  
  public Integer getPosixId() {
    return this.posixId;
  }
  
  public void setPosixId(Integer paramInteger) {
    this.posixId = paramInteger;
  }
  
  public Boolean isShellAccess() {
    return this.shellAccess;
  }
  
  public void setShellAccess(Boolean paramBoolean) {
    this.shellAccess = paramBoolean;
  }
}
