package com.vmware.vim25;

import com.vmware.vim25.BoolOption;
import com.vmware.vim25.VirtualDeviceOption;
import com.vmware.vim25.VirtualSerialPortOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualSerialPortOption", propOrder = {"yieldOnPoll"})
public class VirtualSerialPortOption extends VirtualDeviceOption {
  @XmlElement(required = true)
  protected BoolOption yieldOnPoll;
  
  public BoolOption getYieldOnPoll() {
    return this.yieldOnPoll;
  }
  
  public void setYieldOnPoll(BoolOption paramBoolOption) {
    this.yieldOnPoll = paramBoolOption;
  }
}
