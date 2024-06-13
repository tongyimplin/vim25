package com.vmware.vim25;

import com.vmware.vim25.ChoiceOption;
import com.vmware.vim25.VirtualVmxnet3Option;
import com.vmware.vim25.VirtualVmxnet3VrdmaOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualVmxnet3VrdmaOption", propOrder = {"deviceProtocol"})
public class VirtualVmxnet3VrdmaOption extends VirtualVmxnet3Option {
  protected ChoiceOption deviceProtocol;
  
  public ChoiceOption getDeviceProtocol() {
    return this.deviceProtocol;
  }
  
  public void setDeviceProtocol(ChoiceOption paramChoiceOption) {
    this.deviceProtocol = paramChoiceOption;
  }
}
