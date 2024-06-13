package com.vmware.vim25;

import com.vmware.vim25.CannotAccessFile;
import com.vmware.vim25.CannotAccessFileFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "CannotAccessFileFault", targetNamespace = "urn:vim25")
public class CannotAccessFileFaultMsg extends Exception {
  private CannotAccessFile faultInfo;
  
  public CannotAccessFileFaultMsg(String paramString, CannotAccessFile paramCannotAccessFile) {
    super(paramString);
    this.faultInfo = paramCannotAccessFile;
  }
  
  public CannotAccessFileFaultMsg(String paramString, CannotAccessFile paramCannotAccessFile, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramCannotAccessFile;
  }
  
  public CannotAccessFile getFaultInfo() {
    return this.faultInfo;
  }
}
