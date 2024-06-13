package com.vmware.vim25;

import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.ValidateStoragePodConfigResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "ValidateStoragePodConfigResponse")
public class ValidateStoragePodConfigResponse {
  protected LocalizedMethodFault returnval;
  
  public LocalizedMethodFault getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(LocalizedMethodFault paramLocalizedMethodFault) {
    this.returnval = paramLocalizedMethodFault;
  }
}
