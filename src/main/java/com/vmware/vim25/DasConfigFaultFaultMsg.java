package com.vmware.vim25;

import com.vmware.vim25.DasConfigFault;
import com.vmware.vim25.DasConfigFaultFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "DasConfigFaultFault", targetNamespace = "urn:vim25")
public class DasConfigFaultFaultMsg extends Exception {
  private DasConfigFault faultInfo;
  
  public DasConfigFaultFaultMsg(String paramString, DasConfigFault paramDasConfigFault) {
    super(paramString);
    this.faultInfo = paramDasConfigFault;
  }
  
  public DasConfigFaultFaultMsg(String paramString, DasConfigFault paramDasConfigFault, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramDasConfigFault;
  }
  
  public DasConfigFault getFaultInfo() {
    return this.faultInfo;
  }
}
