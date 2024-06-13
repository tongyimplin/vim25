package com.vmware.vim25;

import com.vmware.vim25.GuestOperationsFault;
import com.vmware.vim25.GuestRegistryFault;
import com.vmware.vim25.GuestRegistryKeyFault;
import com.vmware.vim25.GuestRegistryValueFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestRegistryFault", propOrder = {"windowsSystemErrorCode"})
@XmlSeeAlso({GuestRegistryValueFault.class, GuestRegistryKeyFault.class})
public class GuestRegistryFault extends GuestOperationsFault {
  protected long windowsSystemErrorCode;
  
  public long getWindowsSystemErrorCode() {
    return this.windowsSystemErrorCode;
  }
  
  public void setWindowsSystemErrorCode(long paramLong) {
    this.windowsSystemErrorCode = paramLong;
  }
}
