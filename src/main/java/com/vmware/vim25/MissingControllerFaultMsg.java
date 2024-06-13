package com.vmware.vim25;

import com.vmware.vim25.MissingController;
import com.vmware.vim25.MissingControllerFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "MissingControllerFault", targetNamespace = "urn:vim25")
public class MissingControllerFaultMsg extends Exception {
  private MissingController faultInfo;
  
  public MissingControllerFaultMsg(String paramString, MissingController paramMissingController) {
    super(paramString);
    this.faultInfo = paramMissingController;
  }
  
  public MissingControllerFaultMsg(String paramString, MissingController paramMissingController, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramMissingController;
  }
  
  public MissingController getFaultInfo() {
    return this.faultInfo;
  }
}
