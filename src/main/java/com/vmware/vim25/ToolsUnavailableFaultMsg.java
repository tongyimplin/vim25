package com.vmware.vim25;

import com.vmware.vim25.ToolsUnavailable;
import com.vmware.vim25.ToolsUnavailableFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "ToolsUnavailableFault", targetNamespace = "urn:vim25")
public class ToolsUnavailableFaultMsg extends Exception {
  private ToolsUnavailable faultInfo;
  
  public ToolsUnavailableFaultMsg(String paramString, ToolsUnavailable paramToolsUnavailable) {
    super(paramString);
    this.faultInfo = paramToolsUnavailable;
  }
  
  public ToolsUnavailableFaultMsg(String paramString, ToolsUnavailable paramToolsUnavailable, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramToolsUnavailable;
  }
  
  public ToolsUnavailable getFaultInfo() {
    return this.faultInfo;
  }
}
