package com.vmware.vim25;

import com.vmware.vim25.AnswerFileUpdateFailed;
import com.vmware.vim25.AnswerFileUpdateFailedFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "AnswerFileUpdateFailedFault", targetNamespace = "urn:vim25")
public class AnswerFileUpdateFailedFaultMsg extends Exception {
  private AnswerFileUpdateFailed faultInfo;
  
  public AnswerFileUpdateFailedFaultMsg(String paramString, AnswerFileUpdateFailed paramAnswerFileUpdateFailed) {
    super(paramString);
    this.faultInfo = paramAnswerFileUpdateFailed;
  }
  
  public AnswerFileUpdateFailedFaultMsg(String paramString, AnswerFileUpdateFailed paramAnswerFileUpdateFailed, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramAnswerFileUpdateFailed;
  }
  
  public AnswerFileUpdateFailed getFaultInfo() {
    return this.faultInfo;
  }
}
