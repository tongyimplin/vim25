package com.vmware.vim25;

import com.vmware.vim25.SSPIChallenge;
import com.vmware.vim25.SSPIChallengeFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "SSPIChallengeFault", targetNamespace = "urn:vim25")
public class SSPIChallengeFaultMsg extends Exception {
  private SSPIChallenge faultInfo;
  
  public SSPIChallengeFaultMsg(String paramString, SSPIChallenge paramSSPIChallenge) {
    super(paramString);
    this.faultInfo = paramSSPIChallenge;
  }
  
  public SSPIChallengeFaultMsg(String paramString, SSPIChallenge paramSSPIChallenge, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramSSPIChallenge;
  }
  
  public SSPIChallenge getFaultInfo() {
    return this.faultInfo;
  }
}
