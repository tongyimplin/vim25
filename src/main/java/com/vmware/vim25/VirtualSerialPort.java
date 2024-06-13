package com.vmware.vim25;

import com.vmware.vim25.VirtualDevice;
import com.vmware.vim25.VirtualSerialPort;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualSerialPort", propOrder = {"yieldOnPoll"})
public class VirtualSerialPort extends VirtualDevice {
  protected boolean yieldOnPoll;
  
  public boolean isYieldOnPoll() {
    return this.yieldOnPoll;
  }
  
  public void setYieldOnPoll(boolean paramBoolean) {
    this.yieldOnPoll = paramBoolean;
  }
}
