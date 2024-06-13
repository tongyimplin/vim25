package com.vmware.vim25;

import com.vmware.vim25.InvalidDeviceSpec;
import com.vmware.vim25.InvalidVmConfig;
import com.vmware.vim25.SwapPlacementOverrideNotSupported;
import com.vmware.vim25.TooManyDevices;
import com.vmware.vim25.UnsupportedGuest;
import com.vmware.vim25.VmConfigFault;
import com.vmware.vim25.VmWwnConflict;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidVmConfig", propOrder = {"property"})
@XmlSeeAlso({TooManyDevices.class, UnsupportedGuest.class, VmWwnConflict.class, InvalidDeviceSpec.class, SwapPlacementOverrideNotSupported.class})
public class InvalidVmConfig extends VmConfigFault {
  protected String property;
  
  public String getProperty() {
    return this.property;
  }
  
  public void setProperty(String paramString) {
    this.property = paramString;
  }
}
