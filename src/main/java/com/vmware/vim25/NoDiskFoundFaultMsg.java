package com.vmware.vim25;

import com.vmware.vim25.NoDiskFound;
import com.vmware.vim25.NoDiskFoundFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "NoDiskFoundFault", targetNamespace = "urn:vim25")
public class NoDiskFoundFaultMsg extends Exception {
  private NoDiskFound faultInfo;
  
  public NoDiskFoundFaultMsg(String paramString, NoDiskFound paramNoDiskFound) {
    super(paramString);
    this.faultInfo = paramNoDiskFound;
  }
  
  public NoDiskFoundFaultMsg(String paramString, NoDiskFound paramNoDiskFound, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramNoDiskFound;
  }
  
  public NoDiskFound getFaultInfo() {
    return this.faultInfo;
  }
}
