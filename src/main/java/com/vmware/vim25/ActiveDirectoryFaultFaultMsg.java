package com.vmware.vim25;

import com.vmware.vim25.ActiveDirectoryFault;
import com.vmware.vim25.ActiveDirectoryFaultFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "ActiveDirectoryFaultFault", targetNamespace = "urn:vim25")
public class ActiveDirectoryFaultFaultMsg extends Exception {
  private ActiveDirectoryFault faultInfo;
  
  public ActiveDirectoryFaultFaultMsg(String paramString, ActiveDirectoryFault paramActiveDirectoryFault) {
    super(paramString);
    this.faultInfo = paramActiveDirectoryFault;
  }
  
  public ActiveDirectoryFaultFaultMsg(String paramString, ActiveDirectoryFault paramActiveDirectoryFault, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramActiveDirectoryFault;
  }
  
  public ActiveDirectoryFault getFaultInfo() {
    return this.faultInfo;
  }
}
