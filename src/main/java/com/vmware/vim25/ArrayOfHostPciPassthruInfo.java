package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostPciPassthruInfo;
import com.vmware.vim25.HostPciPassthruInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostPciPassthruInfo", propOrder = {"hostPciPassthruInfo"})
public class ArrayOfHostPciPassthruInfo {
  @XmlElement(name = "HostPciPassthruInfo")
  protected List<HostPciPassthruInfo> hostPciPassthruInfo;
  
  public List<HostPciPassthruInfo> getHostPciPassthruInfo() {
    if (this.hostPciPassthruInfo == null)
      this.hostPciPassthruInfo = new ArrayList<>(); 
    return this.hostPciPassthruInfo;
  }
}
