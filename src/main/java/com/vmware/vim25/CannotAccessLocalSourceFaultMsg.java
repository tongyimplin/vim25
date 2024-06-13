package com.vmware.vim25;

import com.vmware.vim25.CannotAccessLocalSource;
import com.vmware.vim25.CannotAccessLocalSourceFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "CannotAccessLocalSourceFault", targetNamespace = "urn:vim25")
public class CannotAccessLocalSourceFaultMsg extends Exception {
  private CannotAccessLocalSource faultInfo;
  
  public CannotAccessLocalSourceFaultMsg(String paramString, CannotAccessLocalSource paramCannotAccessLocalSource) {
    super(paramString);
    this.faultInfo = paramCannotAccessLocalSource;
  }
  
  public CannotAccessLocalSourceFaultMsg(String paramString, CannotAccessLocalSource paramCannotAccessLocalSource, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramCannotAccessLocalSource;
  }
  
  public CannotAccessLocalSource getFaultInfo() {
    return this.faultInfo;
  }
}
