package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostRdmaDevice;
import com.vmware.vim25.HostRdmaDevice;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostRdmaDevice", propOrder = {"hostRdmaDevice"})
public class ArrayOfHostRdmaDevice {
  @XmlElement(name = "HostRdmaDevice")
  protected List<HostRdmaDevice> hostRdmaDevice;
  
  public List<HostRdmaDevice> getHostRdmaDevice() {
    if (this.hostRdmaDevice == null)
      this.hostRdmaDevice = new ArrayList<>(); 
    return this.hostRdmaDevice;
  }
}
