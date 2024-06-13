package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostGraphicsConfigDeviceType;
import com.vmware.vim25.HostGraphicsConfigDeviceType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostGraphicsConfigDeviceType", propOrder = {"hostGraphicsConfigDeviceType"})
public class ArrayOfHostGraphicsConfigDeviceType {
  @XmlElement(name = "HostGraphicsConfigDeviceType")
  protected List<HostGraphicsConfigDeviceType> hostGraphicsConfigDeviceType;
  
  public List<HostGraphicsConfigDeviceType> getHostGraphicsConfigDeviceType() {
    if (this.hostGraphicsConfigDeviceType == null)
      this.hostGraphicsConfigDeviceType = new ArrayList<>(); 
    return this.hostGraphicsConfigDeviceType;
  }
}
