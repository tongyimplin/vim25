package com.vmware.vim25;

import com.vmware.vim25.PatchNotApplicable;
import com.vmware.vim25.PatchNotApplicableFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "PatchNotApplicableFault", targetNamespace = "urn:vim25")
public class PatchNotApplicableFaultMsg extends Exception {
  private PatchNotApplicable faultInfo;
  
  public PatchNotApplicableFaultMsg(String paramString, PatchNotApplicable paramPatchNotApplicable) {
    super(paramString);
    this.faultInfo = paramPatchNotApplicable;
  }
  
  public PatchNotApplicableFaultMsg(String paramString, PatchNotApplicable paramPatchNotApplicable, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramPatchNotApplicable;
  }
  
  public PatchNotApplicable getFaultInfo() {
    return this.faultInfo;
  }
}
