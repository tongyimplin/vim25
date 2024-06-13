package com.vmware.vim25;

import com.vmware.vim25.InvalidController;
import com.vmware.vim25.InvalidDeviceSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidController", propOrder = {"controllerKey"})
public class InvalidController extends InvalidDeviceSpec {
  protected int controllerKey;
  
  public int getControllerKey() {
    return this.controllerKey;
  }
  
  public void setControllerKey(int paramInt) {
    this.controllerKey = paramInt;
  }
}
