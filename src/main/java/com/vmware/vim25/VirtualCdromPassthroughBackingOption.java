package com.vmware.vim25;

import com.vmware.vim25.BoolOption;
import com.vmware.vim25.VirtualCdromPassthroughBackingOption;
import com.vmware.vim25.VirtualDeviceDeviceBackingOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualCdromPassthroughBackingOption", propOrder = {"exclusive"})
public class VirtualCdromPassthroughBackingOption extends VirtualDeviceDeviceBackingOption {
  @XmlElement(required = true)
  protected BoolOption exclusive;
  
  public BoolOption getExclusive() {
    return this.exclusive;
  }
  
  public void setExclusive(BoolOption paramBoolOption) {
    this.exclusive = paramBoolOption;
  }
}
