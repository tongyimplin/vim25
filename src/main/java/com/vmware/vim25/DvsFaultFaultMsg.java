package com.vmware.vim25;

import com.vmware.vim25.DvsFault;
import com.vmware.vim25.DvsFaultFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "DvsFaultFault", targetNamespace = "urn:vim25")
public class DvsFaultFaultMsg extends Exception {
  private DvsFault faultInfo;
  
  public DvsFaultFaultMsg(String paramString, DvsFault paramDvsFault) {
    super(paramString);
    this.faultInfo = paramDvsFault;
  }
  
  public DvsFaultFaultMsg(String paramString, DvsFault paramDvsFault, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramDvsFault;
  }
  
  public DvsFault getFaultInfo() {
    return this.faultInfo;
  }
}
