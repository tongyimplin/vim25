package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostOpaqueNetworkInfo;
import com.vmware.vim25.HostOpaqueNetworkInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostOpaqueNetworkInfo", propOrder = {"hostOpaqueNetworkInfo"})
public class ArrayOfHostOpaqueNetworkInfo {
  @XmlElement(name = "HostOpaqueNetworkInfo")
  protected List<HostOpaqueNetworkInfo> hostOpaqueNetworkInfo;
  
  public List<HostOpaqueNetworkInfo> getHostOpaqueNetworkInfo() {
    if (this.hostOpaqueNetworkInfo == null)
      this.hostOpaqueNetworkInfo = new ArrayList<>(); 
    return this.hostOpaqueNetworkInfo;
  }
}
