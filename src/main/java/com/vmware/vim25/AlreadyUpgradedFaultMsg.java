package com.vmware.vim25;

import com.vmware.vim25.AlreadyUpgraded;
import com.vmware.vim25.AlreadyUpgradedFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "AlreadyUpgradedFault", targetNamespace = "urn:vim25")
public class AlreadyUpgradedFaultMsg extends Exception {
  private AlreadyUpgraded faultInfo;
  
  public AlreadyUpgradedFaultMsg(String paramString, AlreadyUpgraded paramAlreadyUpgraded) {
    super(paramString);
    this.faultInfo = paramAlreadyUpgraded;
  }
  
  public AlreadyUpgradedFaultMsg(String paramString, AlreadyUpgraded paramAlreadyUpgraded, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramAlreadyUpgraded;
  }
  
  public AlreadyUpgraded getFaultInfo() {
    return this.faultInfo;
  }
}
