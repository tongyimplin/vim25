package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostHardwareElementInfo;
import com.vmware.vim25.HostHardwareElementInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostHardwareElementInfo", propOrder = {"hostHardwareElementInfo"})
public class ArrayOfHostHardwareElementInfo {
  @XmlElement(name = "HostHardwareElementInfo")
  protected List<HostHardwareElementInfo> hostHardwareElementInfo;
  
  public List<HostHardwareElementInfo> getHostHardwareElementInfo() {
    if (this.hostHardwareElementInfo == null)
      this.hostHardwareElementInfo = new ArrayList<>(); 
    return this.hostHardwareElementInfo;
  }
}
