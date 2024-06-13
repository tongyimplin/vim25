package com.vmware.vim25;

import com.vmware.vim25.FileFault;
import com.vmware.vim25.FileFaultFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "FileFaultFault", targetNamespace = "urn:vim25")
public class FileFaultFaultMsg extends Exception {
  private FileFault faultInfo;
  
  public FileFaultFaultMsg(String paramString, FileFault paramFileFault) {
    super(paramString);
    this.faultInfo = paramFileFault;
  }
  
  public FileFaultFaultMsg(String paramString, FileFault paramFileFault, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramFileFault;
  }
  
  public FileFault getFaultInfo() {
    return this.faultInfo;
  }
}
