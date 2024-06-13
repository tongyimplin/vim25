package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostSriovDevicePoolInfo;
import com.vmware.vim25.HostSriovDevicePoolInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostSriovDevicePoolInfo", propOrder = {"hostSriovDevicePoolInfo"})
public class ArrayOfHostSriovDevicePoolInfo {
  @XmlElement(name = "HostSriovDevicePoolInfo")
  protected List<HostSriovDevicePoolInfo> hostSriovDevicePoolInfo;
  
  public List<HostSriovDevicePoolInfo> getHostSriovDevicePoolInfo() {
    if (this.hostSriovDevicePoolInfo == null)
      this.hostSriovDevicePoolInfo = new ArrayList<>(); 
    return this.hostSriovDevicePoolInfo;
  }
}
