package com.vmware.vim25;

import com.vmware.vim25.BoolOption;
import com.vmware.vim25.VirtualCdromRemotePassthroughBackingOption;
import com.vmware.vim25.VirtualDeviceRemoteDeviceBackingOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualCdromRemotePassthroughBackingOption", propOrder = {"exclusive"})
public class VirtualCdromRemotePassthroughBackingOption extends VirtualDeviceRemoteDeviceBackingOption {
  @XmlElement(required = true)
  protected BoolOption exclusive;
  
  public BoolOption getExclusive() {
    return this.exclusive;
  }
  
  public void setExclusive(BoolOption paramBoolOption) {
    this.exclusive = paramBoolOption;
  }
}
