package com.vmware.vim25;

import com.vmware.vim25.PutUsbScanCodesResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "PutUsbScanCodesResponse")
public class PutUsbScanCodesResponse {
  protected int returnval;
  
  public int getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(int paramInt) {
    this.returnval = paramInt;
  }
}
