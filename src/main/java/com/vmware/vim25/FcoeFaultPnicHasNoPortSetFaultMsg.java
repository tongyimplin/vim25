package com.vmware.vim25;

import com.vmware.vim25.FcoeFaultPnicHasNoPortSet;
import com.vmware.vim25.FcoeFaultPnicHasNoPortSetFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "FcoeFaultPnicHasNoPortSetFault", targetNamespace = "urn:vim25")
public class FcoeFaultPnicHasNoPortSetFaultMsg extends Exception {
  private FcoeFaultPnicHasNoPortSet faultInfo;
  
  public FcoeFaultPnicHasNoPortSetFaultMsg(String paramString, FcoeFaultPnicHasNoPortSet paramFcoeFaultPnicHasNoPortSet) {
    super(paramString);
    this.faultInfo = paramFcoeFaultPnicHasNoPortSet;
  }
  
  public FcoeFaultPnicHasNoPortSetFaultMsg(String paramString, FcoeFaultPnicHasNoPortSet paramFcoeFaultPnicHasNoPortSet, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramFcoeFaultPnicHasNoPortSet;
  }
  
  public FcoeFaultPnicHasNoPortSet getFaultInfo() {
    return this.faultInfo;
  }
}
