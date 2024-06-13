package com.vmware.vim25;

import com.vmware.vim25.CannotCreateFile;
import com.vmware.vim25.CannotCreateFileFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "CannotCreateFileFault", targetNamespace = "urn:vim25")
public class CannotCreateFileFaultMsg extends Exception {
  private CannotCreateFile faultInfo;
  
  public CannotCreateFileFaultMsg(String paramString, CannotCreateFile paramCannotCreateFile) {
    super(paramString);
    this.faultInfo = paramCannotCreateFile;
  }
  
  public CannotCreateFileFaultMsg(String paramString, CannotCreateFile paramCannotCreateFile, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramCannotCreateFile;
  }
  
  public CannotCreateFile getFaultInfo() {
    return this.faultInfo;
  }
}
