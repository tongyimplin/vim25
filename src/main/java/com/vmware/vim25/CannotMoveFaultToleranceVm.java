package com.vmware.vim25;

import com.vmware.vim25.CannotMoveFaultToleranceVm;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CannotMoveFaultToleranceVm", propOrder = {"moveType", "vmName"})
public class CannotMoveFaultToleranceVm extends VimFault {
  @XmlElement(required = true)
  protected String moveType;
  
  @XmlElement(required = true)
  protected String vmName;
  
  public String getMoveType() {
    return this.moveType;
  }
  
  public void setMoveType(String paramString) {
    this.moveType = paramString;
  }
  
  public String getVmName() {
    return this.vmName;
  }
  
  public void setVmName(String paramString) {
    this.vmName = paramString;
  }
}
