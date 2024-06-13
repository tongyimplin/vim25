package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostBootDevice;
import com.vmware.vim25.HostBootDevice;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostBootDevice", propOrder = {"hostBootDevice"})
public class ArrayOfHostBootDevice {
  @XmlElement(name = "HostBootDevice")
  protected List<HostBootDevice> hostBootDevice;
  
  public List<HostBootDevice> getHostBootDevice() {
    if (this.hostBootDevice == null)
      this.hostBootDevice = new ArrayList<>(); 
    return this.hostBootDevice;
  }
}
