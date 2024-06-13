package com.vmware.vim25;

import com.vmware.vim25.FileNotFound;
import com.vmware.vim25.FileNotFoundFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "FileNotFoundFault", targetNamespace = "urn:vim25")
public class FileNotFoundFaultMsg extends Exception {
  private FileNotFound faultInfo;
  
  public FileNotFoundFaultMsg(String paramString, FileNotFound paramFileNotFound) {
    super(paramString);
    this.faultInfo = paramFileNotFound;
  }
  
  public FileNotFoundFaultMsg(String paramString, FileNotFound paramFileNotFound, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramFileNotFound;
  }
  
  public FileNotFound getFaultInfo() {
    return this.faultInfo;
  }
}
