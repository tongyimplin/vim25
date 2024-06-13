package com.vmware.vim25;

import com.vmware.vim25.InvalidFolder;
import com.vmware.vim25.InvalidFolderFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "InvalidFolderFault", targetNamespace = "urn:vim25")
public class InvalidFolderFaultMsg extends Exception {
  private InvalidFolder faultInfo;
  
  public InvalidFolderFaultMsg(String paramString, InvalidFolder paramInvalidFolder) {
    super(paramString);
    this.faultInfo = paramInvalidFolder;
  }
  
  public InvalidFolderFaultMsg(String paramString, InvalidFolder paramInvalidFolder, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramInvalidFolder;
  }
  
  public InvalidFolder getFaultInfo() {
    return this.faultInfo;
  }
}
