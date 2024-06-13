package com.vmware.vim25;

import com.vmware.vim25.ChoiceOption;
import com.vmware.vim25.VirtualDeviceBackingOption;
import com.vmware.vim25.VirtualPrecisionClockSystemClockBackingOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualPrecisionClockSystemClockBackingOption", propOrder = {"protocol"})
public class VirtualPrecisionClockSystemClockBackingOption extends VirtualDeviceBackingOption {
  @XmlElement(required = true)
  protected ChoiceOption protocol;
  
  public ChoiceOption getProtocol() {
    return this.protocol;
  }
  
  public void setProtocol(ChoiceOption paramChoiceOption) {
    this.protocol = paramChoiceOption;
  }
}
