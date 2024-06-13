package com.vmware.vim25;

import com.vmware.vim25.ChoiceOption;
import com.vmware.vim25.VirtualDeviceBackingOption;
import com.vmware.vim25.VirtualDeviceURIBackingOption;
import com.vmware.vim25.VirtualSerialPortURIBackingOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDeviceURIBackingOption", propOrder = {"directions"})
@XmlSeeAlso({VirtualSerialPortURIBackingOption.class})
public class VirtualDeviceURIBackingOption extends VirtualDeviceBackingOption {
  @XmlElement(required = true)
  protected ChoiceOption directions;
  
  public ChoiceOption getDirections() {
    return this.directions;
  }
  
  public void setDirections(ChoiceOption paramChoiceOption) {
    this.directions = paramChoiceOption;
  }
}
