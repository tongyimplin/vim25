package com.vmware.vim25;

import com.vmware.vim25.OvfConnectedDevice;
import com.vmware.vim25.OvfExport;
import com.vmware.vim25.OvfHardwareExport;
import com.vmware.vim25.OvfUnableToExportDisk;
import com.vmware.vim25.OvfUnknownDeviceBacking;
import com.vmware.vim25.OvfUnsupportedDeviceExport;
import com.vmware.vim25.VirtualDevice;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfHardwareExport", propOrder = {"device", "vmPath"})
@XmlSeeAlso({OvfUnableToExportDisk.class, OvfUnknownDeviceBacking.class, OvfUnsupportedDeviceExport.class, OvfConnectedDevice.class})
public class OvfHardwareExport extends OvfExport {
  protected VirtualDevice device;
  
  @XmlElement(required = true)
  protected String vmPath;
  
  public VirtualDevice getDevice() {
    return this.device;
  }
  
  public void setDevice(VirtualDevice paramVirtualDevice) {
    this.device = paramVirtualDevice;
  }
  
  public String getVmPath() {
    return this.vmPath;
  }
  
  public void setVmPath(String paramString) {
    this.vmPath = paramString;
  }
}
