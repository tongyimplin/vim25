package com.vmware.vim25;

import com.vmware.vim25.AlreadyExists;
import com.vmware.vim25.AlreadyExistsFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "AlreadyExistsFault", targetNamespace = "urn:vim25")
public class AlreadyExistsFaultMsg extends Exception {
  private AlreadyExists faultInfo;
  
  public AlreadyExistsFaultMsg(String paramString, AlreadyExists paramAlreadyExists) {
    super(paramString);
    this.faultInfo = paramAlreadyExists;
  }
  
  public AlreadyExistsFaultMsg(String paramString, AlreadyExists paramAlreadyExists, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramAlreadyExists;
  }
  
  public AlreadyExists getFaultInfo() {
    return this.faultInfo;
  }
}
