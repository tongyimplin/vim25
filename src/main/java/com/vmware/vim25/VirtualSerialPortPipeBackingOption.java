package com.vmware.vim25;

import com.vmware.vim25.BoolOption;
import com.vmware.vim25.ChoiceOption;
import com.vmware.vim25.VirtualDevicePipeBackingOption;
import com.vmware.vim25.VirtualSerialPortPipeBackingOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualSerialPortPipeBackingOption", propOrder = {"endpoint", "noRxLoss"})
public class VirtualSerialPortPipeBackingOption extends VirtualDevicePipeBackingOption {
  @XmlElement(required = true)
  protected ChoiceOption endpoint;
  
  @XmlElement(required = true)
  protected BoolOption noRxLoss;
  
  public ChoiceOption getEndpoint() {
    return this.endpoint;
  }
  
  public void setEndpoint(ChoiceOption paramChoiceOption) {
    this.endpoint = paramChoiceOption;
  }
  
  public BoolOption getNoRxLoss() {
    return this.noRxLoss;
  }
  
  public void setNoRxLoss(BoolOption paramBoolOption) {
    this.noRxLoss = paramBoolOption;
  }
}
