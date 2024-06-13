package com.vmware.vim25;

import com.vmware.vim25.VimFault;
import com.vmware.vim25.VimFaultFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "VimFaultFault", targetNamespace = "urn:vim25")
public class VimFaultFaultMsg extends Exception {
  private VimFault faultInfo;
  
  public VimFaultFaultMsg(String paramString, VimFault paramVimFault) {
    super(paramString);
    this.faultInfo = paramVimFault;
  }
  
  public VimFaultFaultMsg(String paramString, VimFault paramVimFault, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramVimFault;
  }
  
  public VimFault getFaultInfo() {
    return this.faultInfo;
  }
}
