package com.vmware.vim25;

import com.vmware.vim25.BoolOption;
import com.vmware.vim25.VirtualDeviceOption;
import com.vmware.vim25.VirtualWDTOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualWDTOption", propOrder = {"runOnBoot"})
public class VirtualWDTOption extends VirtualDeviceOption {
  @XmlElement(required = true)
  protected BoolOption runOnBoot;
  
  public BoolOption getRunOnBoot() {
    return this.runOnBoot;
  }
  
  public void setRunOnBoot(BoolOption paramBoolOption) {
    this.runOnBoot = paramBoolOption;
  }
}
