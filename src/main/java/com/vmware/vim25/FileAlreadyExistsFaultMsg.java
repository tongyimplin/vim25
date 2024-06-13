package com.vmware.vim25;

import com.vmware.vim25.FileAlreadyExists;
import com.vmware.vim25.FileAlreadyExistsFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "FileAlreadyExistsFault", targetNamespace = "urn:vim25")
public class FileAlreadyExistsFaultMsg extends Exception {
  private FileAlreadyExists faultInfo;
  
  public FileAlreadyExistsFaultMsg(String paramString, FileAlreadyExists paramFileAlreadyExists) {
    super(paramString);
    this.faultInfo = paramFileAlreadyExists;
  }
  
  public FileAlreadyExistsFaultMsg(String paramString, FileAlreadyExists paramFileAlreadyExists, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramFileAlreadyExists;
  }
  
  public FileAlreadyExists getFaultInfo() {
    return this.faultInfo;
  }
}
