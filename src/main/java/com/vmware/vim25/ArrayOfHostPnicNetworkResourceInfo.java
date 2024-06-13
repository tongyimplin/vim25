package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostPnicNetworkResourceInfo;
import com.vmware.vim25.HostPnicNetworkResourceInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostPnicNetworkResourceInfo", propOrder = {"hostPnicNetworkResourceInfo"})
public class ArrayOfHostPnicNetworkResourceInfo {
  @XmlElement(name = "HostPnicNetworkResourceInfo")
  protected List<HostPnicNetworkResourceInfo> hostPnicNetworkResourceInfo;
  
  public List<HostPnicNetworkResourceInfo> getHostPnicNetworkResourceInfo() {
    if (this.hostPnicNetworkResourceInfo == null)
      this.hostPnicNetworkResourceInfo = new ArrayList<>(); 
    return this.hostPnicNetworkResourceInfo;
  }
}
