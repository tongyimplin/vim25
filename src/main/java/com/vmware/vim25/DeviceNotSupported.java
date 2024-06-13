package com.vmware.vim25;

import com.vmware.vim25.DeviceBackingNotSupported;
import com.vmware.vim25.DeviceControllerNotSupported;
import com.vmware.vim25.DeviceNotSupported;
import com.vmware.vim25.DigestNotSupported;
import com.vmware.vim25.FileBackedPortNotSupported;
import com.vmware.vim25.MultiWriterNotSupported;
import com.vmware.vim25.NonPersistentDisksNotSupported;
import com.vmware.vim25.RDMNotSupported;
import com.vmware.vim25.RawDiskNotSupported;
import com.vmware.vim25.RemoteDeviceNotSupported;
import com.vmware.vim25.SharedBusControllerNotSupported;
import com.vmware.vim25.VMINotSupported;
import com.vmware.vim25.VirtualDiskModeNotSupported;
import com.vmware.vim25.VirtualEthernetCardNotSupported;
import com.vmware.vim25.VirtualHardwareCompatibilityIssue;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceNotSupported", propOrder = {"device", "reason"})
@XmlSeeAlso({DeviceControllerNotSupported.class, SharedBusControllerNotSupported.class, RemoteDeviceNotSupported.class, NonPersistentDisksNotSupported.class, RawDiskNotSupported.class, DigestNotSupported.class, VirtualEthernetCardNotSupported.class, FileBackedPortNotSupported.class, DeviceBackingNotSupported.class, VirtualDiskModeNotSupported.class, MultiWriterNotSupported.class, VMINotSupported.class, RDMNotSupported.class})
public class DeviceNotSupported extends VirtualHardwareCompatibilityIssue {
  @XmlElement(required = true)
  protected String device;
  
  protected String reason;
  
  public String getDevice() {
    return this.device;
  }
  
  public void setDevice(String paramString) {
    this.device = paramString;
  }
  
  public String getReason() {
    return this.reason;
  }
  
  public void setReason(String paramString) {
    this.reason = paramString;
  }
}
