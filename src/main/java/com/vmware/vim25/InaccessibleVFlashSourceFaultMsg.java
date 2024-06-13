package com.vmware.vim25;

import com.vmware.vim25.InaccessibleVFlashSource;
import com.vmware.vim25.InaccessibleVFlashSourceFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "InaccessibleVFlashSourceFault", targetNamespace = "urn:vim25")
public class InaccessibleVFlashSourceFaultMsg extends Exception {
  private InaccessibleVFlashSource faultInfo;
  
  public InaccessibleVFlashSourceFaultMsg(String paramString, InaccessibleVFlashSource paramInaccessibleVFlashSource) {
    super(paramString);
    this.faultInfo = paramInaccessibleVFlashSource;
  }
  
  public InaccessibleVFlashSourceFaultMsg(String paramString, InaccessibleVFlashSource paramInaccessibleVFlashSource, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramInaccessibleVFlashSource;
  }
  
  public InaccessibleVFlashSource getFaultInfo() {
    return this.faultInfo;
  }
}
