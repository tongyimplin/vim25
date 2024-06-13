package com.vmware.vim25;

import com.vmware.vim25.NoSubjectName;
import com.vmware.vim25.NoSubjectNameFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "NoSubjectNameFault", targetNamespace = "urn:vim25")
public class NoSubjectNameFaultMsg extends Exception {
  private NoSubjectName faultInfo;
  
  public NoSubjectNameFaultMsg(String paramString, NoSubjectName paramNoSubjectName) {
    super(paramString);
    this.faultInfo = paramNoSubjectName;
  }
  
  public NoSubjectNameFaultMsg(String paramString, NoSubjectName paramNoSubjectName, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramNoSubjectName;
  }
  
  public NoSubjectName getFaultInfo() {
    return this.faultInfo;
  }
}
