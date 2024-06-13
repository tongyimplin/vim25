package com.vmware.vim25;

import com.vmware.vim25.PatchMetadataInvalid;
import com.vmware.vim25.PatchMetadataInvalidFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "PatchMetadataInvalidFault", targetNamespace = "urn:vim25")
public class PatchMetadataInvalidFaultMsg extends Exception {
  private PatchMetadataInvalid faultInfo;
  
  public PatchMetadataInvalidFaultMsg(String paramString, PatchMetadataInvalid paramPatchMetadataInvalid) {
    super(paramString);
    this.faultInfo = paramPatchMetadataInvalid;
  }
  
  public PatchMetadataInvalidFaultMsg(String paramString, PatchMetadataInvalid paramPatchMetadataInvalid, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramPatchMetadataInvalid;
  }
  
  public PatchMetadataInvalid getFaultInfo() {
    return this.faultInfo;
  }
}
