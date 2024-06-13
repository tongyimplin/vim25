package com.vmware.vim25;

import com.vmware.vim25.ChoiceOption;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LongOption;
import com.vmware.vim25.VirtualMachineVMCIDeviceOptionFilterSpecOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineVMCIDeviceOptionFilterSpecOption", propOrder = {"action", "protocol", "direction", "lowerDstPortBoundary", "upperDstPortBoundary"})
public class VirtualMachineVMCIDeviceOptionFilterSpecOption extends DynamicData {
  @XmlElement(required = true)
  protected ChoiceOption action;
  
  @XmlElement(required = true)
  protected ChoiceOption protocol;
  
  @XmlElement(required = true)
  protected ChoiceOption direction;
  
  @XmlElement(required = true)
  protected LongOption lowerDstPortBoundary;
  
  @XmlElement(required = true)
  protected LongOption upperDstPortBoundary;
  
  public ChoiceOption getAction() {
    return this.action;
  }
  
  public void setAction(ChoiceOption paramChoiceOption) {
    this.action = paramChoiceOption;
  }
  
  public ChoiceOption getProtocol() {
    return this.protocol;
  }
  
  public void setProtocol(ChoiceOption paramChoiceOption) {
    this.protocol = paramChoiceOption;
  }
  
  public ChoiceOption getDirection() {
    return this.direction;
  }
  
  public void setDirection(ChoiceOption paramChoiceOption) {
    this.direction = paramChoiceOption;
  }
  
  public LongOption getLowerDstPortBoundary() {
    return this.lowerDstPortBoundary;
  }
  
  public void setLowerDstPortBoundary(LongOption paramLongOption) {
    this.lowerDstPortBoundary = paramLongOption;
  }
  
  public LongOption getUpperDstPortBoundary() {
    return this.upperDstPortBoundary;
  }
  
  public void setUpperDstPortBoundary(LongOption paramLongOption) {
    this.upperDstPortBoundary = paramLongOption;
  }
}
